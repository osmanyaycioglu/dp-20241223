package org.training.sqills.pattern.structural.bridge;

public class AutomaticCar extends Car {

    @Override
    public void fill(int lt) {
        super.fill(lt);
        range *= 0.8F;
    }
}
