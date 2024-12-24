package org.training.sqills.pattern.abstractclass;

public abstract class AbstractProcess implements IProcess {
    private long delta;

    @Override
    public String afterProcess(final Long longParam) {
        return "process ended with delta : " + delta;
    }

    @Override
    public String teardown(final String stringParam,
                           final Integer integerParam) {
        return stringParam + " " + integerParam + " delta : " + getData();
    }

    public abstract String getData();
}
