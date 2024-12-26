package org.training.sqills.pattern.structural.bridge.oo;

public class CarMain {
    public static void main(String[] args) {
        Car carLoc = new AutomicCar(new DizelFuelType());
        Car carLoc2 = new ManuelkCar(new DizelFuelType());


    }
}
