package org.training.sqills.pattern.structural.decorator;

public class Olive extends Pizza{
    private final Pizza pizza;

    public Olive(final Pizza pizzaParam) {
        pizza = pizzaParam;
    }

    @Override
    public Integer getPrice() {
        return pizza.getPrice() + 25;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ",zeytin";
    }
}
