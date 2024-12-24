package org.training.sqills.pattern.creational.abstractfactory;

public class GreenComboBox implements IComboBox{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Green combobox draw");
    }
}
