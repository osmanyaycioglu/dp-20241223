package org.training.sqills.pattern;


public class Car {
    private String model;
    private Integer avgSpeed;
    private Integer currentSpeed;
    private Integer horsePower;


    public void forward(){
    }

    public void turn(){
    }

    public void cookTea(){
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String modelParam) {
        model = modelParam;
    }

    public Integer getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(final Integer avgSpeedParam) {
        avgSpeed = avgSpeedParam;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(final Integer currentSpeedParam) {
        currentSpeed = currentSpeedParam;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(final Integer horsePowerParam) {
        horsePower = horsePowerParam;
    }
}
