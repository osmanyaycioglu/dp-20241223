package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Account;
import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class TransferCommand implements ICommand {
    private final EAccountType accountType;

    public TransferCommand(EAccountType accountTypeParam) {
        accountType = accountTypeParam;
    }

    @Override
    public void execute(Customer customer,
                        Scanner scannerParam) {
        System.out.println("Gönderilecek hesap no : ");
        String accountNumber = scannerParam.next();
        System.out.println("Göndereceğiniz miktar : ");
        BigDecimal transferAmount = scannerParam.nextBigDecimal();
        transfer(customer,
                 transferAmount,
                 accountType,
                 accountNumber);

    }
    @Override
    public String menuLine() {
        return " " + accountType + " hesabıları arasında para transferi";
    }

    private void transfer(Customer customer,
                          BigDecimal transferAmount,
                          EAccountType accountType,
                          String accountNumber) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.subtract(transferAmount));
            System.out.println(accountType + " gönderme İşleminiz gerçekleştirildi");
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }


}
