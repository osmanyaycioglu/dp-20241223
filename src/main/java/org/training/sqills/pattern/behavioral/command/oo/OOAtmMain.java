package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Account;
import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class OOAtmMain {
    public static void main(String[] args) {
        Map<String, Customer> customerMap = new ConcurrentHashMap<>();
        Customer icustomer = Customer.builder()
                                     .withName("osman")
                                     .withSurname("yaycıoğlu")
                                     .withUsername("osmany")
                                     .withPassword("123456")
                                     .withAccounts(Arrays.asList(new Account(EAccountType.TL,
                                                                             "TL hesabı",
                                                                             new BigDecimal(1000),
                                                                             "TR101"),
                                                                 new Account(EAccountType.DOLAR,
                                                                             "DOLAR hesabı",
                                                                             new BigDecimal(100000),
                                                                             "TR102")))
                                     .build();
        customerMap.put(icustomer.getUsername(),
                        icustomer);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username:");
            String username = scanner.nextLine();
            System.out.println("password:");
            String   password = scanner.nextLine();
            Customer customer = customerMap.get(username);
            if (customer != null) {
                List<ICommand> commandsLoc = AtmMenuFactory.getCommands(customer);
                root:
                while (true) {
                    for (int iLoc = 1; iLoc < commandsLoc.size() + 1; iLoc++) {
                        System.out.println(iLoc + commandsLoc.get(iLoc - 1)
                                                             .menuLine());
                    }
                    System.out.println("seçiminiz : ");
                    int menuIndex = scanner.nextInt();
                    if (menuIndex > 0 && menuIndex < commandsLoc.size() + 1) {
                        commandsLoc.get(menuIndex - 1)
                                   .execute(customer,
                                            scanner);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
