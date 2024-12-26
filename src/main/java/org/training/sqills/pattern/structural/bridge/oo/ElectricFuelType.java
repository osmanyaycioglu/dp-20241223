package org.training.sqills.pattern.structural.bridge.oo;

public class ElectricFuelType extends FuelType {

    @Override
    public int calculate(final int lt) {
        return lt * 8;
    }

}
