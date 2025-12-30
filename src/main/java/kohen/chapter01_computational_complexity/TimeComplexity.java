package kohen.chapter01_computational_complexity;

import java.util.Arrays;

public class TimeComplexity {
    public static int constant(int number) {
        int count = 0;
        int size = 100000;
        for (int index = 0; index < size; index++) {
            count++;
        }
        return count;
    }

    public static int linear(int number) {
        int count = 0;
        for (int index = 0; index < number; index++) {
            count++;
        }
        return count;
    }

    public static int arrayTraversal(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            count++;
        }
        return count;
    }

    public static int quadratic(int number) {
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                count++;
            }
        }
        return count;
    }

    public static int bubbleSort(int[] numbers) {
        int count = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                count += 3;
            }
        }
        return count;
    }

    public static int exponential(int number) {
        int count = 0;
        int base = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < base; j++) {
                count++;
            }
            base *= 2;
        }
        return count;
    }

    public static int expRecur(int number) {
        if (number == 1) {
            return 1;
        }
        return expRecur(number - 1) + expRecur(number - 1) + 1;
    }

    public static int logarithmic(int number) {
        int count = 0;
        while (number > 1) {
            number = number / 2;
            count++;
        }
        return count;
    }

    public static int logRecur(int number) {
        if (number <= 1) {
            return 0;
        }
        return logRecur(number / 2) + 1;
    }

    public static int linearLogRecur(int number) {
        if (number <= 1) {
            return 1;
        }
        int count = linearLogRecur(number / 2) + linearLogRecur(number / 2);
        for (int i = 0; i < number; i++) {
            count++;
        }
        return count;
    }

    public static int factorialRecur(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < number; i++) {
            count += factorialRecur(number - 1);
        }
        return count;
    }

    public static void main() {
        int number = 8;
        System.out.println("Размер входных данных = " + number);
        int count = constant(number);
        System.out.println("Количество операций с постоянной сложностью = " + count);
        count = linear(number);
        System.out.println("Количество операций линейной сложности = " + count);
        count = arrayTraversal(new int[number]);
        System.out.println("Количество операций линейной сложности (при обходе массива) = " + count);
        count = quadratic(number);
        System.out.println("Количество операций квадратичного порядка = " + count);
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = number - i;
        }
        Arrays.stream(numbers).forEach(System.out::println);
        count = bubbleSort(numbers);
        System.out.println("Количество операций квадратичного порядка (пузырьковая сортировка) = " + count);
        Arrays.stream(numbers).forEach(System.out::println);
        count = exponential(number);
        System.out.println("Количество операций с экспоненциальной сложностью (реализованных с помощью цикла) " +
                "= " + count);
        count = expRecur(number);
        System.out.println("Количество операций с экспоненциальной сложностью (реализованных с помощью рекурсии) = " +
                count);
        count = logarithmic(number);
        System.out.println("Количество операций с логарифмической сложностью (реализованных с помощью цикла) = " +
                count);
        count = logRecur(number);
        System.out.println("Количество операций с логарифмической сложностью (реализованных с помощью рекурсии) = " +
                count);
        count = linearLogRecur(number);
        System.out.println("Количество операций с линейной логарифмической сложностью " +
                "(реализованных с помощью рекурсии) = " + count);
        count = factorialRecur(number);
        System.out.println("Количество операций факториальной сложности (реализованных с помощью рекурсии) = " +
                count);
    }
}
