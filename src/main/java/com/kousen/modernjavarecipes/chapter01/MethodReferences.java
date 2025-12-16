package com.kousen.modernjavarecipes.chapter01;

import java.util.stream.Stream;

public class MethodReferences {
    public static void printlnWithLambda() {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(x -> System.out.println(x));

    }

   public static void printlnWithMethodReference() {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(System.out::println);
    }

    static void main() {
        printlnWithLambda();
        printlnWithMethodReference();
    }
}
