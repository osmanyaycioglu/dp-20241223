package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Account;
import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShowCommand implements ICommand {
    private final EAccountType accountType;

    public ShowCommand(EAccountType accountTypeParam) {
        accountType = accountTypeParam;
    }

    @Override
    public void execute(Customer customer,
                        Scanner scannerParam) {
        show(customer,
             EAccountType.TL);

    }
    @Override
    public String menuLine() {
        return " " + accountType + " hesabı görüntüleme";
    }


    private void show(Customer customer,
                      EAccountType accountType) {
        Account account = customer.accountStream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findFirst()
                                  .orElse(null);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }


}
