package org.training.sqills.pattern.structural.bridge;

public class ElecCar extends Car {

    @Override
    public void fill(int lt) {
        range += lt * 15;
    }
}
