package org.training.sqills.pattern.structural.decorator;

import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizzaLoc = new Cheese(new Olive(new Olive(new Mushroom(new BigPizza()))));
        System.out.println(pizzaLoc.getDescription() + " : " + pizzaLoc.getPrice() + " TL");
        try (Scanner scannerLoc = new Scanner(System.in)) {

            Pizza currentPizza = null;
            abc: while (true) {
                System.out.println("""
                                   1-pizza
                                   2-big pizza
                                   3-peynir
                                   4-mantar
                                   5-zeytin
                                   6-pişir
                                   seçiminiz
                                   """);
                int index = scannerLoc.nextInt();
                if (index > 5){
                    break abc;
                }
                currentPizza = PizzaFactory.add(index,
                                                currentPizza);
                System.out.println("Current : " + currentPizza.getDescription() + " fiyat : " + currentPizza.getPrice());
            }
            System.out.println("final : " + currentPizza.getDescription() + " fiyat : " + currentPizza.getPrice());

        }
    }
}
