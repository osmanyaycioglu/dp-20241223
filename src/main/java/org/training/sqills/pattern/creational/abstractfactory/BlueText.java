package org.training.sqills.pattern.creational.abstractfactory;

public class BlueText implements IText{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Blue text draw");
    }
}
