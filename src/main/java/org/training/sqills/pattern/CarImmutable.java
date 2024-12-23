package org.training.sqills.pattern;

public class CarImmutable {
    private final String model;
    private final Integer avgSpeed;
    private final Integer currentSpeed;
    private final Integer horsePower;

    public CarImmutable(final String modelParam,
                        final Integer avgSpeedParam,
                        final Integer currentSpeedParam,
                        final Integer horsePowerParam) {
        model        = modelParam;
        avgSpeed     = avgSpeedParam;
        currentSpeed = currentSpeedParam;
        horsePower   = horsePowerParam;
    }

    public String getModel() {
        return model;
    }

    public Integer getAvgSpeed() {
        return avgSpeed;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public Integer getHorsePower() {
        return horsePower;
    }
}
