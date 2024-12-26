package org.training.sqills.pattern.structural.bridge.oo;

public class NormalFuelType extends FuelType {

    @Override
    public int calculate(final int lt) {
        return lt * 12;
    }

}
