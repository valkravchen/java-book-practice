package com.kousen.modernjavarecipes.chapter01;

import java.util.stream.Stream;

public class MethodReferences {
    public static void printlnWithLambda() {
        Stream.of(3, 1, 4, 1, 5, 9).forEach(x -> System.out.println(x));

    }

    static void main() {
        printlnWithLambda();
    }
}
