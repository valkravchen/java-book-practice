package kohen.chapter01_computational_complexity;

import java.util.Stack;

public class Recursion {
    public static int recur(int number) {
        if (number == 1) {
            return 1;
        }
        int result = recur(number - 1);
        return number + result;
    }

    public static int tailRecur(int number, int result) {
        if (number == 0) {
            return result;
        }
        return tailRecur(number - 1, result + number);
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return number - 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int forLoopRecur(int number) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int index = number; index > 0; index--) {
            stack.push(index);
        }
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }

    static void main() {
        int number = 5;
        int result;
        result = recur(number);
        System.out.println("Суммарный результат рекурсивной функции = " + result);
        result = tailRecur(number, 0);
        System.out.println("Суммарный результат хвостовой рекурсивной функции = " + result);
        result = fibonacci(number);
        System.out.println("Число " + number + " в последовательности Фибоначчи = " + result);
        result = forLoopRecur(number);
        System.out.println("Результат суммирования с использованием итерации для имитации рекурсии = " + result);
    }
}
