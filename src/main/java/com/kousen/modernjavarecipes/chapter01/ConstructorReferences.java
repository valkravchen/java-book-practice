package com.kousen.modernjavarecipes.chapter01;

import java.util.Arrays;
import java.util.List;

public class ConstructorReferences {
    public static void convertPersonsToNamesWithLambda() {
        List<Person> people = Arrays.asList(
                new Person("Grace Hopper"),
                new Person("Barbara Liskov"),
                new Person("Ada Lovelace")
        );
        List<String> names = people.stream()
                .map(person -> person.getName())
                .toList();
    }

    public static void convertPersonsToNamesWithMethodReference(){
        List<Person> people = Arrays.asList(
                new Person("Grace Hopper"),
                new Person("Barbara Liskov"),
                new Person("Ada Lovelace")
        );
        List<String> names = people.stream()
                .map(Person::getName)
                .toList();
    }

    static void main() {
        convertPersonsToNamesWithLambda();
        convertPersonsToNamesWithMethodReference();
    }
}
