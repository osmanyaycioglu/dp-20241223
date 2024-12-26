package org.training.sqills.pattern.structural.decorator;

public class Mushroom extends Pizza{
    private final Pizza pizza;

    public Mushroom(final Pizza pizzaParam) {
        pizza = pizzaParam;
    }

    @Override
    public Integer getPrice() {
        return pizza.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ",mantar";
    }
}
