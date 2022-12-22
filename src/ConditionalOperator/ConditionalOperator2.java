package ConditionalOperator;

public class ConditionalOperator2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

        private static void task1() {
            short clientOS = 0;
                if (clientOS == 1) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
        }
        private static void task2() {
            short clientOS = 0;
            int clientDeviceYear = 2012;
            int clientProduction = 2015;
            if (clientOS == 0 && clientDeviceYear<clientProduction) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear>=clientProduction) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        private static void task3() {
            int year = 2100;
            if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
                System.out.println(year + " " + "год является високосным");
            } else {
                System.out.println(year + " " + "год не является високосным");
            }
            }
        private static void task4() {
            int deliveryDistance = 100;
            int days = -1;
            if (deliveryDistance >= 0 && deliveryDistance <= 20) {
                days = 1;
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                days = 2;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                days = 3;
            }
            if (days != -1) {
                System.out.println("Потребуется дней: " + days);
            } else {
                System.out.println("Доставки нет");
            }
            }

        private static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " " + "- й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " " + "- й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " " + "- й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " " + "- й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Нет такого месяца");

        }
        }
}
