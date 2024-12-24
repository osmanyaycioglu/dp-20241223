package org.training.sqills.pattern.creational.abstractfactory;

public class GreenButton implements IButton{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Blue button draw");
    }
}
