package org.training.sqills.pattern.creational.abstractfactory;

public class TemplateMain {
    public static void main(String[] args) {
        ITemplateAbstractFactory abstractFactoryLoc = TemplateFactory.createAbstractFactory(1);
        IButton                  buttonLoc          = abstractFactoryLoc.createButton();
        IText                    textLoc            = abstractFactoryLoc.createText();
        IComboBox                comboBoxLoc        = abstractFactoryLoc.createCombobox();
    }
}
