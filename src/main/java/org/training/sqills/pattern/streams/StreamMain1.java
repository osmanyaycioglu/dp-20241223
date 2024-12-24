package org.training.sqills.pattern.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<String> osmanLoc = List.of("osman",
                                        "ali",
                                        "veli",
                                        "osman",
                                        "ayşe",
                                        "fatma");
        osmanLoc.stream()
                .peek(s -> System.out.println("Before map1 : " + s + " " + Thread.currentThread()
                                                                                 .getName()))
                .map(s -> s.length())
                .peek(s -> System.out.println("Before filter : " + s + " " + Thread.currentThread()
                                                                                   .getName()))
                .filter(i -> i > 3)
                .peek(s -> System.out.println("Before map2 : " + s + " " + Thread.currentThread()
                                                                                 .getName()))
                .map(i -> "string length " + i)
                .peek(s -> System.out.println("Before collect : " + s + " " + Thread.currentThread()
                                                                                    .getName()))
                .collect(Collectors.toList());
        List<Character> collectLoc = osmanLoc.stream()
                                             .flatMap(StreamMain1::getCharacterStream)
                                             .distinct()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted chars : " + collectLoc);
    }

    private static Stream<Character> getCharacterStream(final String s) {
        char[]      charArrayLoc = s.toCharArray();
        Character[] c            = new Character[charArrayLoc.length];
        for (int i = 0; i < charArrayLoc.length; i++) {
            c[i] = charArrayLoc[i];
        }
        return Arrays.stream(c);
    }

}
