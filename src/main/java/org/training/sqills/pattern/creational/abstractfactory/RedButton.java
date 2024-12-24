package org.training.sqills.pattern.creational.abstractfactory;

public class RedButton implements IButton{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Red button draw");
    }
}
