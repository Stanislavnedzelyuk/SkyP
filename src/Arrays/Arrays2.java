package Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();

    }
    private static void task1() {

        int[] salaryArray = generateRandomArray();
        System.out.print(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary: salaryArray) {
            salarySum += salary;

            System.out.println("Сумма трат за месяц составила" + " " + salarySum + " " + "рублей");

        }
    }

    private static void task2() {
        System.out.println("Task2");
        int[] salaryArray = generateRandomArray();
        System.out.print(Arrays.toString(salaryArray));

        int salaryMin = Integer.MIN_VALUE;
        int salaryMax = Integer.MAX_VALUE;

        for (int salary : salaryArray) {
            if (salary > salaryMax) {
                salaryMax = salary;
            }
            if (salary < salaryMin) {
                salaryMin = salary;
            }
            System.out.println("Минимальная сумма трат за день составила" + " " + salaryMin + " " + "рублей. " +
                    "Максимальная сумма трат за день составила" + " " + salaryMax + " " + "рублей");
        }

    }
    private static void task3() {
        System.out.println("Task3");

        /*
        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        Напишите программу, которая посчитает среднее значение трат за месяц
        (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей». Важно помнить: подсчет среднего значения может иметь остаток,
        то есть быть не целым, а дробным числом.
         */

        int[] salaryArray = generateRandomArray();
        System.out.print(Arrays.toString(salaryArray));

        int daysCount = 30;
        int salarySum = 0;
        for (int salary: salaryArray) {
            salarySum += salary;
            double salaryAverage = (double) salarySum / daysCount;
            System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");
        }
    }

    private static void task4() {
        System.out.println("Task4!");

        /*
        В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        В качестве данных для массива используйте: char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено: Ivanov Ivan.
        Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        массиву циклом и распечатать его элементы в правильном порядке.
         */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 200_000;
        }
        return arr;
    }

}








