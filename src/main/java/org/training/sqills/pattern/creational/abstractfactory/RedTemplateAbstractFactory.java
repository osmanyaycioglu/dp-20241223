package org.training.sqills.pattern.creational.abstractfactory;

public class RedTemplateAbstractFactory implements ITemplateAbstractFactory {
    @Override
    public IButton createButton() {
        return new RedButton();
    }

    @Override
    public IText createText() {
        return new RedText();
    }

    @Override
    public IComboBox createCombobox() {
        return new RedComboBox();
    }
}
