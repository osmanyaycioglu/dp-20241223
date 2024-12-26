package org.training.sqills.pattern.structural.bridge.oo;

public class DizelFuelType extends FuelType {

    @Override
    public int calculate(final int lt) {
        return lt * 15;
    }
}
