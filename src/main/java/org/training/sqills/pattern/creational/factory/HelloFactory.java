package org.training.sqills.pattern.creational.factory;

import org.training.sqills.pattern.interfaces.polymorphic.*;

import java.util.List;

public class HelloFactory {

    private static List<IHello> hellos = List.of(new HelloEng(),
                                                 new HelloEsp(),
                                                 new HelloTr(),
                                                 new HelloJp());

    public static IHello createHello(int index) {
        if (index > hellos.size()) {
            return hellos.getFirst();
        }
        return hellos.get(index - 1);
    }

    public static void showMenu() {
        int starti = 1;
        for (IHello helloLoc : hellos) {
            System.out.println(starti + "-" + helloLoc.getSummary());
            starti++;
        }
        System.out.println("seçiminiz : ");
    }

    public static IHello createHelloOld(int index) {
        switch (index) {
            case 1 -> {
                return new HelloEng();
            }
            case 2 -> {
                return new HelloEsp();
            }
            default -> {
                return new HelloTr();
            }
        }
    }

}
