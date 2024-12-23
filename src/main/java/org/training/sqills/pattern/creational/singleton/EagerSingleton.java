package org.training.sqills.pattern.creational.singleton;

public class EagerSingleton {

    public static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public String hello() {
        return "Hello from eager singleton";
    }

}
