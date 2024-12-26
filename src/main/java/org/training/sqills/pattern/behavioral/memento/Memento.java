package org.training.sqills.pattern.behavioral.memento;


public class Memento {
    private String data;
    private int counter;

    public String getData() {
        return data;
    }

    public void setData(final String dataParam) {
        data = dataParam;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(final int counterParam) {
        counter = counterParam;
    }
}
