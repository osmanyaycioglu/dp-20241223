package org.training.sqills.pattern.structural.bridge;

public class DizelCar extends Car {

    @Override
    public void fill(int lt) {
        range += lt * 15;
    }

}
