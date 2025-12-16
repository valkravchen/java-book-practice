package com.kousen.modernjavarecipes.chapter01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
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

    public static void methodReferenceAsVariable() {
        Consumer<Integer> printer = System.out::println;
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(printer);
    }

    public static void staticMethodReference() {
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void sortWithLambda() {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .toList();
    }

    public static void sortWithMethodReference() {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted(String::compareTo)
                .toList();
    }

    public static void mapWithMethodReference() {
        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void lambdaVsMethodReferenceEquivalent() {
        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(string -> string.length())
                .forEach(System.out::println);
    }

    static void main() {
        printlnWithLambda();
        printlnWithMethodReference();
        methodReferenceAsVariable();
        staticMethodReference();
        sortWithLambda();
        sortWithMethodReference();
        mapWithMethodReference();
        lambdaVsMethodReferenceEquivalent();
    }
}
