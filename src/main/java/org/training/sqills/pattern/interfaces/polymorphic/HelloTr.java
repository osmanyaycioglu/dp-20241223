package org.training.sqills.pattern.interfaces.polymorphic;

public class HelloTr implements IHello{
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Merhaba " + name + " " + surname;
    }

    @Override
    public String sayGoodye(final String name,
                            final String surname) {
        return "Güle güle " + name + " " + surname;
    }

    @Override
    public String getSummary() {
        return "turkce";
    }

}
