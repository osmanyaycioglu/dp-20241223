package org.training.sqills.pattern.structural.bridge;

public class HybridCar extends Car {

    @Override
    public void fill(int lt) {
        range += lt * 8;
    }
}
