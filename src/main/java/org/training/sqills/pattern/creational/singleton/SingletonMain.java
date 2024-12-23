package org.training.sqills.pattern.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println(EagerSingleton.instance.hello());
        System.out.println(ESingleton.INSTANCE.hello());
        System.out.println(LazySingleton.getInstance().hello());
    }
}
