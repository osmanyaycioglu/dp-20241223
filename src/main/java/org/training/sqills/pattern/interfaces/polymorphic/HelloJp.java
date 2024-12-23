package org.training.sqills.pattern.interfaces.polymorphic;

public class HelloJp implements IHello{
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "ha " + name + " " + surname;
    }

    @Override
    public String sayGoodye(final String name,
                            final String surname) {
        return "ho " + name + " " + surname;
    }

    @Override
    public String getSummary() {
        return "japonca";
    }

}
