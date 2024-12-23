package org.training.sqills.pattern.interfaces.polymorphic;

import org.training.sqills.pattern.creational.factory.HelloFactory;

import java.util.Scanner;

public class HelloMain {
    public static void main(String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        HelloFactory.showMenu();
        int    iLoc     = scannerLoc.nextInt();
        IHello helloLoc = HelloFactory.createHello(iLoc);

        System.out.println(helloLoc.sayHello("osman",
                                             "yaycıoğlu"));
    }
}
