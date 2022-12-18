package Variables;

public class Variables2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        byte w = 3;
        short y = 2;
        int x = 1;
        long q = 4;
        float t = 1.1F;
        double u = 1.11;
        System.out.println("Значение переменной" + " " + "w" + " " + "с типом byte равно" + " " + 3);
        System.out.println("Значение переменной" + " " + "y" + " " + "с типом short равно" + " " + 2);
        System.out.println("Значение переменной" + " " + "x" + " " + "с типом int равно" + " " + 1);
        System.out.println("Значение переменной" + " " + "q" + " " + "с типом long равно" + " " + 4);
        System.out.println("Значение переменной" + " " + "t" + " " + "с типом float равно" + " " + 1.1);
        System.out.println("Значение переменной" + " " + "u" + " " + "с типом double равно" + " " + 1.11);
    }
    public static void task2 () {
        float x = 27.12F;
        long q = 987678965549L;
        double e = 2.786;
        short r = 569;
        int t = -159;
        short u = 67;
    }
    public static void task3 () {
        short lp = 23;
        short as = 27;
        short ea = 30;
        int list = 480;
        System.out.println("На каждого ученика рассчитано" + " " + (list/(lp+as+ea)) + " " + "листов бумаги");
    }
    public static void task4 () {
        short machineEfficiency = 16;
        short time = 2;
        int meom = machineEfficiency/time;   // meom == machineEfficiencyOneMinute
        short twentyMinutes = 20;
        int oneDay = 1;
        int treeDays = 3;
        int month = 1;
        int oneDayToMinutes = oneDay*1440;
        int treeDaysToMinutes = treeDays*oneDayToMinutes;
        int monthToMinutes = oneDayToMinutes*month*30;
        System.out.println("За" + " " + twentyMinutes + " " + "минут" + " " + "машина произвела" + " " + twentyMinutes*meom + " " + "штук бутылок");
        System.out.println("За" + " " + oneDay + " " + "сутки" + " " + "машина произвела" + " " + oneDayToMinutes*meom + " " + "штук бутылок");
        System.out.println("За" + " " + treeDays + " " + "дня" + " " + "машина произвела" + " " + treeDaysToMinutes*meom + " " + "штук бутылок");
        System.out.println("За" + " " + month + " " + "месяц" + " " + "машина произвела" + " " + monthToMinutes*meom + " " + "штук бутылок");
    }
    public static void task5 () {
        int allJar = 120;
        int oneClassWhite = 2;
        int oneClassBrown = 4;
        int allClass = allJar/(oneClassBrown+oneClassWhite);
        int allWhite = oneClassWhite*allClass;
        int allBrown = oneClassBrown*allClass;
        System.out.println("В школе, где" + " " + allClass + " " + "классов, нужно" + " " + allWhite + " " + "банок белой краски и" + " " + allBrown + " " + "банок коричневой краски");
    }
    public static void task6 () {
        short bananaCount = 5;
        short oneBananaWeight = 80;
        int fiveBananaToWeight = bananaCount*oneBananaWeight;
        short milkVolume = 200;
        short oneMilk = 105;
        short milkCount = 2;
        int allMilkVolume = milkCount*oneMilk;
        short icecream = 2;
        short icecreamWeight = 100;
        int icecreamToWeight = icecream*icecreamWeight;
        short eggsCount = 4;
        short eggsWeight = 70;
        int eggsToWeight = eggsWeight*eggsCount;
        int allWeight = fiveBananaToWeight+allMilkVolume+icecreamToWeight+eggsToWeight;
        int kg = allWeight/1000;
        System.out.println(allWeight);
        System.out.println(kg);
    }
    public static void task7 () {
        short weightKilo = 7;
        int weightToGram = weightKilo*1000;
        int weight1 = 250;
        int weight2 = 500;
        System.out.println(weightToGram/weight1);
        System.out.println(weightToGram/weight2);
    }
    public static void task8 () {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int crisSalary = 76230;
        double increaseSalary = 0.1;
        double mashaSalaryNew = mashaSalary+(mashaSalary*increaseSalary);
        double denisSalaryNew = denisSalary+(denisSalary*increaseSalary);
        double crisSalaryNew = crisSalary+ (crisSalary*increaseSalary);
        int allSalary = (mashaSalary+denisSalary+crisSalary)*12;
        double allSalaryNew = (mashaSalaryNew+denisSalaryNew+crisSalaryNew)*12;
        double varianceSalary = allSalaryNew-allSalary;
        System.out.println("Маша теперь получает" + " " + mashaSalaryNew + " " + "рублей. Годовой доход вырос на" + " " + (mashaSalaryNew-mashaSalary) + " " + "рублей");
        System.out.println("Денис теперь получает" + " " + denisSalaryNew + " " + "рублей. Годовой доход вырос на" + " " + (denisSalaryNew-denisSalary) + " " + "рублей");
        System.out.println("Кристина теперь получает" + " " + crisSalaryNew + " " + "рублей. Годовой доход вырос на" + " " + (crisSalaryNew-crisSalary) + " " + "рублей");
    }
}
