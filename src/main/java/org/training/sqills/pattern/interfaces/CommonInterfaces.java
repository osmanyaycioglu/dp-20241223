package org.training.sqills.pattern.interfaces;

import java.math.BigDecimal;
import java.util.function.*;

public class CommonInterfaces {

    public static void main(String[] args) {
        Consumer<String>           consumerLoc   = s -> System.out.println("Data length : " + s.length());
        BiConsumer<String, String> biConsumerLoc = (s1, s2) -> System.out.println(s1 + "-" + s2);
        Consumer<Integer>          consumeriLoc  = i -> System.out.println("gelen " + i);
        IntConsumer                consumeripLoc = i -> System.out.println("gelen " + i);
        LongConsumer consumerLoc1 = l -> System.out.println(l);
        DoubleConsumer consumerLoc2 = d -> System.out.println(d);

        Function<String, Integer>               functionLoc   = String::length;
        BiFunction<String, Integer, BigDecimal> biFunctionLoc = (s, i) -> new BigDecimal(s.length() + i);

        Supplier<String> supplierLoc = () -> "osman";

        Predicate<String>           predicateLoc   = s -> s.length() == 10;
        BiPredicate<String, String> biPredicateLoc = (s1, s2) -> s1.equals(s2);

    }
}
