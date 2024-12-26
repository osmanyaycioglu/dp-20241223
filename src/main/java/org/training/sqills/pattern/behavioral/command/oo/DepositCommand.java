package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Account;
import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class DepositCommand implements ICommand {
    private final EAccountType accountType;

    public DepositCommand(EAccountType accountTypeParam) {
        accountType = accountTypeParam;
    }

    @Override
    public void execute(Customer customer,
                        Scanner scannerParam) {
        System.out.println("Yatıracağınız miktar : ");
        BigDecimal depositAmount = scannerParam.nextBigDecimal();
        deposit(customer,
                depositAmount,
                accountType);

    }

    @Override
    public String menuLine() {
        return " " + accountType + " hesabına ye para yatırma";
    }

    private void deposit(Customer customer,
                         BigDecimal depositAmount,
                         EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.add(depositAmount));
            System.out.println(accountType + " yatırma İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }


}
