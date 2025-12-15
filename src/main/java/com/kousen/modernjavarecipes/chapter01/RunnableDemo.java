package com.kousen.modernjavarecipes.chapter01;

public class RunnableDemo {
    static void main() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("внутри Runnable в анонимном внутреннем классе");
            }
        }).start();

        new Thread(() -> System.out.println("внутри конструктора Thread с использованием лямбды")).start();
    }
}
