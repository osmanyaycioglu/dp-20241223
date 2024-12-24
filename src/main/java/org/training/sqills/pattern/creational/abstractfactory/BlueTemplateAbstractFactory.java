package org.training.sqills.pattern.creational.abstractfactory;

public class BlueTemplateAbstractFactory implements ITemplateAbstractFactory {
    @Override
    public IButton createButton() {
        return new BlueButton();
    }

    @Override
    public IText createText() {
        return new BlueText();
    }

    @Override
    public IComboBox createCombobox() {
        return new BlueComboBox();
    }
}
