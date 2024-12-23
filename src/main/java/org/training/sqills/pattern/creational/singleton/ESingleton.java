package org.training.sqills.pattern.creational.singleton;

public enum ESingleton {
    INSTANCE;

    public String hello() {
        return "Hello from enum singleton";
    }
}
