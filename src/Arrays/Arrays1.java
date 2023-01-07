package Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println("Task1");
        int[] first = new int[]{1, 2, 3};
        double[] second = new double[]{1.57, 7.654, 9.986};
        int[] third = new int[]{1, 5, 9};
    }

    private static void task2() {
        System.out.println("Task2");
        int[] first = new int[]{1, 2, 3};
        double[] second = new double[]{1.57, 7.654, 9.986};
        int[] third = new int[]{1, 5, 9};
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);

            if (i != first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);

            if (i != second.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);

            if (i != third.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3 () {
        System.out.println("Task3");
        int[] first = new int[]{1, 2, 3};
        double[] second = new double[]{1.57, 7.654, 9.986};
        int[] third = new int[]{1, 5, 9};

        for (int i = first.length - 1; i >= 0;  i--) {
            System.out.print(first[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = second.length - 1; i >= 0;  i--) {
            System.out.print(second[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = third.length - 1; i >= 0;  i--) {
            System.out.print(third[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task4 () {
        System.out.println("Task4");
        int[] first = new int[] {1, 2, 3};
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i]++;
            }

        }
        System.out.println(Arrays.toString(first));
    }
}

