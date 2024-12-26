package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Account;
import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class WithdrawCommand implements ICommand{
    private final EAccountType accountType;

    public WithdrawCommand(EAccountType accountTypeParam) {
        accountType = accountTypeParam;
    }

    @Override
    public void execute(Customer customer,
                        Scanner scannerParam) {
        System.out.println("Çekeceğiniz miktar : ");
        BigDecimal withdrawAmount = scannerParam.nextBigDecimal();
        withdraw(customer,
                 withdrawAmount,
                 accountType);

    }
    @Override
    public String menuLine() {
        return " " + accountType + " hesabından ye para çekme";
    }

    private void withdraw(Customer customer,
                          BigDecimal withdrawAmount,
                          EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.subtract(withdrawAmount));
            System.out.println(accountType + " çekme İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }
    }

}
