package org.training.sqills.pattern.structural.bridge.oo;

public class Car {
    protected int range;
    private final FuelType fuelType;

    public Car(final FuelType fuelTypeParam) {
        fuelType = fuelTypeParam;
    }

    public void fill(int lt){
        range += fuelType.calculate(lt);
    }

    public void forward(int km) {
        if (range > km) {
            System.out.println(km + " forward");
            range = range - km;
        } else {
            range = 0;
            System.out.println(range + " forward");
        }
    }

    public int getRange() {
        return range;
    }
}
