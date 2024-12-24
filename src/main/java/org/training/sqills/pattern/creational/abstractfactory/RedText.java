package org.training.sqills.pattern.creational.abstractfactory;

public class RedText implements IText{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Red text draw");
    }
}
