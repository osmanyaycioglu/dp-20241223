package org.training.sqills.pattern.structural.bridge;

public class CarRun {
    public static void main(String[] args) {
        Car car = new HybridCar();

        car.fill(20);
        System.out.println("range : " + car.getRange());
    }
}
