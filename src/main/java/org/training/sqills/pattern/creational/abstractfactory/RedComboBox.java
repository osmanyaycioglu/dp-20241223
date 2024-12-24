package org.training.sqills.pattern.creational.abstractfactory;

public class RedComboBox implements IComboBox{
    @Override
    public void draw(final int x,
                     final int y) {
        System.out.println("Red combobox draw");
    }
}
