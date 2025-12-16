package com.kousen.modernjavarecipes.chapter01;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person person) {
        this.name = person.name;
    }

    public Person(String... names) {
        System.out.println("Varargs ctor, names=" + Arrays.asList(names));
        this.name = Arrays.stream(names)
                .collect(Collectors.joining(" "));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
