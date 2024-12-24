package org.training.sqills.pattern.creational.abstractfactory;

public class TemplateFactory {
    public static ITemplateAbstractFactory createAbstractFactory(int color) {
        return switch (color) {
            case 1 -> new RedTemplateAbstractFactory();
            case 2 -> new BlueTemplateAbstractFactory();
            case 3 -> new GreenTemplateAbstractFactory();
            default -> null;
        };

    }
}

