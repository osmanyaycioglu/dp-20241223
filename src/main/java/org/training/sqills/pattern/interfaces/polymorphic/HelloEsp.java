package org.training.sqills.pattern.interfaces.polymorphic;

public class HelloEsp implements IHello{
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String sayGoodye(final String name,
                            final String surname) {
        return "Adios " + name + " " + surname;
    }

    @Override
    public String getSummary() {
        return "ispanyolca";
    }
}
