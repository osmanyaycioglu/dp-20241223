package org.training.sqills.pattern.creational.abstractfactory;

public interface ITemplateAbstractFactory {

    IButton createButton();
    IText createText();
    IComboBox createCombobox();
}
