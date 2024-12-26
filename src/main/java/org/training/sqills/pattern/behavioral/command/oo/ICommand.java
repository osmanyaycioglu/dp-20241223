package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Customer;

import java.util.Scanner;

public interface ICommand {

    void execute(Customer customer,
                 Scanner scannerParam);

    String menuLine();
}
