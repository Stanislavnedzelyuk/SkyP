package While;

public class While1 {
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
        System.out.println("Task1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Task3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Task4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " " + "год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Task6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Task7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Task8");
        int monthAmount = 29000;
        for (int month = 1; month <= 12; month++) {
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, month * monthAmount);
        }
    }

    public static void task9() {
        System.out.println("Task9");
        int monthAmount = 29000;
        double montlyPercent = 0.01;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total += monthAmount + total * montlyPercent;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, total);

        }
    }
    public static void task10() {
        System.out.println("Task10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}
