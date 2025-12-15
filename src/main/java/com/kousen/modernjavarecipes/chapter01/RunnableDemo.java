package com.kousen.modernjavarecipes.chapter01;

import java.io.File;
import java.util.Arrays;

public class RunnableDemo {
    static void main() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("внутри Runnable в анонимном внутреннем классе");
            }
        }).start();

        new Thread(() -> System.out.println("внутри конструктора Thread с использованием лямбды")).start();

        Runnable runnable = () -> System.out.println("лямбда-выражение, реализующее метод run");
        new Thread(runnable).start();

        File directory = new File("./src/main/java");
        String[] names = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));
    }
}
