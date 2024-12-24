package org.training.sqills.pattern.playground;

import java.util.function.Supplier;

public class PlayMain1 {

    public static boolean st = true;
    public static void main(String[] args) {

        dene(() -> "osman" + args.length + " - " + args[0]);


    }

    public static void dene(Supplier<String> stringParam) {
        if (stringParam != null && st) {
            System.out.println("10 : " + stringParam.get());
        }
    }
}
