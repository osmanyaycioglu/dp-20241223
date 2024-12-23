package org.training.sqills.pattern.creational.builder;

public class CarMain {
    public static void main(String[] args) {
        CarImmutableBuilder builderLoc = CarImmutableBuilder.builder()
                                                            .setModel("BMW")
                                                            .setAvgSpeed(100)
                                                            .setHorsePower(170)
                                                            .setCurrentSpeed(10)
                                                            .build();
    }
}
