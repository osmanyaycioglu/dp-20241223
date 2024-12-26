package org.training.sqills.pattern.structural.decorator;

public class PizzaFactory {
    public static Pizza add(int  index,Pizza pizzaParam){
        switch (index) {
            case 1:
                return new Pizza();
            case 2:
                return new BigPizza();
            case 3:
                return new Cheese(pizzaParam);
            case 4:
                return new Mushroom(pizzaParam);
            case 5:
                return new Olive(pizzaParam);
            default:
                return pizzaParam;
        }
    }
}
