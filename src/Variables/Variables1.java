package Variables;

public class Variables1 {

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
            var dog = 8;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }
        public static void task2 () {
            var dog = 8;
            var cat = 3.6;
            var paper = 763789;
            dog = dog*4;
            cat = cat*4;
            paper = paper*4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }
        public static void task3 () {
            var dog = 8;
            var cat = 3.6;
            var paper = 763789;
            dog = (int) (dog-3.5);
            cat = cat-1.6;
            paper = paper-7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }
        public static void task4 () {
            var friend = 19;
            System.out.println(friend);
            friend = friend*2;
            System.out.println(friend);
            friend = friend/7;
            System.out.println(friend);
        }
        public static void task5 () {
            var frog = 3.5;
            System.out.println(frog);
            frog = frog*10;
            System.out.println(frog);
            frog = frog/3.5;
            System.out.println(frog);
            frog = frog+4;
            System.out.println(frog);
        }
        public static void task6 () {
            var boxer1Weight = 78.2;
            var boxer2Weight = 82.7;
            System.out.println(boxer1Weight+boxer2Weight);
            System.out.println(boxer2Weight-boxer1Weight);
        }
        public static void task7 () {
            var boxer1Weight = 78.2;
            var boxer2Weight = 82.7;
            var weight1 = boxer2Weight-boxer1Weight;
            var weight2 = boxer2Weight%boxer1Weight;
        }
        public static void task8 () {
            var allTime = 640;
            var onePerson = 8;
            var allPerson = 94;
            System.out.println("Всего работников в компании - " + allTime/onePerson + " " + "человек");
            System.out.println("Если в компании работает" + " " + allPerson + " " + "человек, то всего" + " " + allTime/allPerson + " " + "часов работы может быть поделено между сотрудниками");
        }
    }

