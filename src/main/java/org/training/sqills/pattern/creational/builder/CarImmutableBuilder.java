package org.training.sqills.pattern.creational.builder;

public class CarImmutableBuilder {
    private final String  model;
    private final Integer avgSpeed;
    private final Integer currentSpeed;
    private final Integer horsePower;

    private CarImmutableBuilder(final String modelParam,
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

    public static CarImmutableBuilderBuilder builder(){
        return new CarImmutableBuilderBuilder();
    }

    public static class CarImmutableBuilderBuilder {
        private String  model;
        private Integer avgSpeed;
        private Integer currentSpeed;
        private Integer horsePower;

        private CarImmutableBuilderBuilder() {
        }

        public String getModel() {
            return model;
        }

        public CarImmutableBuilderBuilder setModel(final String modelParam) {
            model = modelParam;
            return this;
        }

        public Integer getAvgSpeed() {
            return avgSpeed;
        }

        public CarImmutableBuilderBuilder setAvgSpeed(final Integer avgSpeedParam) {
            avgSpeed = avgSpeedParam;
            return this;
        }

        public Integer getCurrentSpeed() {
            return currentSpeed;
        }

        public CarImmutableBuilderBuilder setCurrentSpeed(final Integer currentSpeedParam) {
            currentSpeed = currentSpeedParam;
            return this;
        }

        public Integer getHorsePower() {
            return horsePower;
        }

        public CarImmutableBuilderBuilder setHorsePower(final Integer horsePowerParam) {
            horsePower = horsePowerParam;
            return this;
        }

        public CarImmutableBuilder build() {
            return new CarImmutableBuilder(model,
                                           avgSpeed,
                                           currentSpeed,
                                           horsePower);
        }
    }

}
