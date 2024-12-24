package org.training.sqills.pattern.creational.abstractfactory;

public class ButtonFactory {

    public static IButton createButton(int color) {
        return switch (color) {
            case 1 -> new RedButton();
            case 2 -> new BlueButton();
            default -> new GreenButton();
        };
    }
}
