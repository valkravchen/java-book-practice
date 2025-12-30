package kohen.chapter01_computational_complexity;

import java.util.Arrays;
import java.util.Collections;

public class WorstBestTimeComplexity {
    public static int[] randomNumbers(int number) {
        Integer[] numbers = new Integer[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(numbers));
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i] = numbers[i];
        }
        return result;
    }

    public static int findOne(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    static void main() {
        for (int i = 0; i < 10; i++) {
            int number = 100;
            int[] numbers = randomNumbers(number);
            int index = findOne(numbers);
            System.out.println("Массив [ 1, 2, ..., n ] после перестановки = " + Arrays.toString(numbers));
            System.out.println("Индекс числа 1 = " + index);
        }
    }
}
