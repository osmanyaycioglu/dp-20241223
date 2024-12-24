package org.training.sqills.pattern.creational.abstractfactory;

public class GreenTemplateAbstractFactory implements ITemplateAbstractFactory {
    @Override
    public IButton createButton() {
        return new GreenButton();
    }

    @Override
    public IText createText() {
        return new GreenText();
    }

    @Override
    public IComboBox createCombobox() {
        return new GreenComboBox();
    }
}
