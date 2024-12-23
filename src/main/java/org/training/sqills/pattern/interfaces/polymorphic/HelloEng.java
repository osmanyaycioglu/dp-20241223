package org.training.sqills.pattern.interfaces.polymorphic;

public class HelloEng implements IHello{
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Override
    public String sayGoodye(final String name,
                            final String surname) {
        return "Goodbye " + name + " " + surname;
    }

    @Override
    public String getSummary() {
        return "ingilizce";
    }

}
