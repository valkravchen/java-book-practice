package com.kousen.modernjavarecipes.chapter01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    public static void convertPersonsToNamesWithMethodReference() {
        List<Person> people = Arrays.asList(
                new Person("Grace Hopper"),
                new Person("Barbara Liskov"),
                new Person("Ada Lovelace")
        );
        List<String> names = people.stream()
                .map(Person::getName)
                .toList();
    }

    public static void convertNamesWithLambda() {
        List<String> names = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
                "Karen Spärck Jones");

        List<Person> people = names.stream()
                .map(name -> new Person(name))
                .toList();
    }

    public static void convertNamesWithConstructorReference() {
        List<String> names = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
                "Karen Spärck Jones");

        List<Person> people = names.stream()
                .map(Person::new)
                .toList();
    }

    public static void copyConstructorProblem() {
        Person before = new Person("Grace Hopper");
        List<Person> people = Stream.of(before).toList();
        Person after = people.get(0);
        System.out.println(before == after);
        before.setName("Grace Murray Hopper");
        System.out.println("Grace Murray Hopper".equals(after.getName()));
    }

    public static void main() {
        convertPersonsToNamesWithLambda();
        convertPersonsToNamesWithMethodReference();
        convertNamesWithLambda();
        convertNamesWithConstructorReference();
        copyConstructorProblem();
    }
}
