package kohen.chapter01_computational_complexity;

public class Iteration {
    public static int forLoop(int number) {
        int result = 0;
        for (int index = 0; index <= number; index++) {
            result += index;
        }
        return result;
    }

    public static int whileLoop(int number) {
        int result = 0;
        int index = 1;
        while (index <= number) {
            result += index;
            index++;
        }
        return result;
    }

    public static int whileLoopII(int number) {
        int result = 0;
        int index = 1;
        while (index <= number) {
            result += index;
            index++;
            index *= 2;
        }
        return result;
    }

    public static String nestedForLoop(int number) {
        StringBuilder result = new StringBuilder();
        for (int index = 1; index <= number; index++) {
            for (int nested = 1; nested <= number; nested++) {
                result.append("(" + index + ", " + nested + "), ");
            }
        }
        return result.toString();
    }

    static void main() {
        int number = 5;
        int result;

        result = forLoop(number);
        System.out.println("\nСуммарный результат цикла for = " + result);

        result = whileLoop(number);
        System.out.println("\nСуммарный результат цикла while = " + result);

        result = whileLoopII(number);
        System.out.println("\nСуммарный результат цикла while (с двумя обновлениями) = " + result);

        String resStr = nestedForLoop(number);
        System.out.println("\nРезультат двойного обхода цикла for = " + resStr);
    }
}

