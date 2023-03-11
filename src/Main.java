public class Main {

    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task0() {
        System.out.println("Задача 0");
        int salary = 65535;
        int total = 0;
        for (; total < 1_000_000; ) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 1;
        for (i = 1; total != 2_475_000; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Итог " + total);
        }
        System.out.println(total);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.println(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int k = 10; k > 0; k--) {
            System.out.println(k + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        double a = 12_000_000;
        int d = 8;
        int b = 17;
        int year = 0;
        while (year < 10) {
            a = a + (b - d) / 1000.0 * a;
            System.out.printf("%.2f \n", a);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15_000;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            System.out.printf("%.2f \n", sum);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15_000;
        for (int month = 1; sum < 12_000_000; month++) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.printf("номер месяца " + month + " %.2f \n", sum);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15_000;
        for (int month = 1; month <= 9 * 12; month++) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.printf("номер месяца " + month + " %.2f \n", sum);
            }
        }
    }


    public static void task7() {
        System.out.println("Задача 7");
        int sundey = 5;
        for (int i = sundey; i <= 31; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int kometa = 0;
        for (int i = 200; i <= 2021; i = i + 79) {

                System.out.println(i);
            }
        }
}
