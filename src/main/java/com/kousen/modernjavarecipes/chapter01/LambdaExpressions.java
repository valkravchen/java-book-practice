package com.kousen.modernjavarecipes.chapter01;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class LambdaExpressions {

    public static void runnableWithAnonymousClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("внутри Runnable в анонимном внутреннем классе");
            }
        }).start();
    }

    public static void runnableWithLambda() {
        new Thread(() -> System.out.println("внутри конструктора Thread с использованием лямбды")).start();
    }

    public static void runnableAsVariable() {
        Runnable runnable = () -> System.out.println("лямбда-выражение, реализующее метод run");
        new Thread(runnable).start();
    }

    public static void filenameFilterWithAnonymousClass() {
        File directory = new File("./src/main/java");
        String[] names = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        System.out.println(Arrays.asList(names));
    }

    public static void filenameFilterWithLambda() {
        File directory = new File("./src/main/java");
        String[] names = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));
    }

    public static void filenameFilterWithExplicitTypes() {
        File directory = new File("./src/main/java");
        String[] names = directory.list((File dir, String name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));
    }

    public static void filenameFilterWithBlockSyntax() {
        File directory = new File("./src/main/java");
        String[] names = directory.list((File dir, String name) -> {
            return name.endsWith(".java");
        });
        System.out.println(Arrays.asList(names));
    }

    static void main() {
        runnableWithAnonymousClass();
        runnableWithLambda();
        runnableAsVariable();
        filenameFilterWithAnonymousClass();
        filenameFilterWithLambda();
        filenameFilterWithExplicitTypes();
        filenameFilterWithBlockSyntax();
    }
}
