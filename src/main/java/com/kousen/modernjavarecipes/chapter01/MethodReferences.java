package com.kousen.modernjavarecipes.chapter01;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MethodReferences {
    public static void printlnWithLambda() {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(x -> System.out.println(x));

    }

    public static void printlnWithReference() {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(System.out::println);
    }

    public static void referenceAsVariable() {
        Consumer<Integer> printer = System.out::println;
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(printer);
    }

    static void main() {
        printlnWithLambda();
        printlnWithReference();
        referenceAsVariable();
    }
}
