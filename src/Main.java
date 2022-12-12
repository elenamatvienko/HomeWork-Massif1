import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1.1");
        int[] digit = new int[3];
        digit[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(digit[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 1.2");
        double[] digit = {1.57, 7.654, 9.986};
        for (int i = 0; i < digit.length; i++) {
            System.out.println(digit[i]);
        }
    }

    public static void task3() {
        System.out.println("Задача 1.3");
        double[] digit = {2.5, 5.3, 7.8, 9.3, 12.5, 15.1};
        for (int i = 0; i < digit.length; i++) {
            System.out.println(digit[i]);
        }
    }

    public static void task4() {
        System.out.println("Задача 2.1");
        int[] digit = {1, 2, 3};
        digit[0] = 1;
        for (int i = 0; i < digit.length; i++) {
            System.out.print(digit[i]);
            if (i != digit.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 2.2");
        double[] digit = {1.57, 7.654, 9.986};
        for (int i = 0; i < digit.length; i++) {
            System.out.print(digit[i]);
            if (i != digit.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 2.3");
        char[] symbol = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < symbol.length; i++) {
            System.out.print(symbol[i]);
            if (i != symbol.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 3.1");
        int[] digit = {1, 2, 3};
        digit[0] = 1;
        for (int i = digit.length - 1; i >= 0; i--) {
            System.out.print(digit[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 3.2");
        double[] digit = {1.57, 7.654, 9.986};
        for (int i = digit.length - 1; i >= 0; i--) {
            System.out.print(digit[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 3.3");
        char[] symbol = {'a', 'b', 'c', 'd'};
        for (int i = symbol.length - 1; i >= 0; i--) {
            System.out.print(symbol[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 4");
        int[] digit = {1, 2, 3};
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] % 2 != 0) {
            digit[i] += 1;
            }
        }

        System.out.println(Arrays.toString(digit));
    }
}





