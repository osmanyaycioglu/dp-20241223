package org.training.sqills.pattern.structural.bridge.oo;

public class ManuelkCar extends Car {
    private int current = 0;

    public ManuelkCar(final FuelType fuelTypeParam) {
        super(fuelTypeParam);
    }

    public void shift() {
        current++;
    }

}
