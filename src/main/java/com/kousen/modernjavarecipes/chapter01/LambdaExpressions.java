package com.kousen.modernjavarecipes.chapter01;

public class LambdaExpressions {

    public static void runnableWithAnonymousClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("внутри Runnable в анонимном внутреннем классе");
            }
        }).start();
    }

    static void main() {
        runnableWithAnonymousClass();
    }
}
