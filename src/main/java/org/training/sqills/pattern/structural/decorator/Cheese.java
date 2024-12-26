package org.training.sqills.pattern.structural.decorator;

public class Cheese extends Pizza{
    private final Pizza pizza;

    public Cheese(final Pizza pizzaParam) {
        pizza = pizzaParam;
    }

    @Override
    public Integer getPrice() {
        return pizza.getPrice() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ",peynir";
    }
}
