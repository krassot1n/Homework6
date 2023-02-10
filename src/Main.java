import java.text.DecimalFormat;

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

    private static void task1() {
        System.out.println("Задача №1");
        for( int i = 1; i < 11;i++){
            System.out.println(i);
        }
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задача №2");
        for( int i = 11;i > 0;i = i - 1){
            System.out.println(i);
        }
        System.out.println();

    }
    private static void task3() {
        System.out.println("Задача №3");
        for( int i = 0;i < 17;i+=2){
            System.out.println(i);
        }
        System.out.println();

    }
    private static void task4() {
        System.out.println("Задача №4");
        for( int i = 10;i > -11;i--){
            System.out.println(i);
        }
        System.out.println();

    }
    private static void task5() {
        System.out.println("Задача №5");
        for( int i = 1904;i <= 2096;i = i + 4){
            System.out.println(i + " год является високосный");
        }
        System.out.println();

    }
    private static void task6() {
        System.out.println("Задача №6");
        for( int i = 7;i <= 100;i = i + 7){
            System.out.println(i);
        }
        System.out.println();

    }
    private static void task7() {
        System.out.println("Задача №7");
        for( int i = 1;i <= 512;i = i * 2){
            System.out.println(i);
        }
        System.out.println();

    }
    private static void task8() {
        System.out.println("Задача №8");
        int monthAccumulation = 29000;
        int total = 0;

        for( int i = 1;i < 13;i = i = i + 1){
            total = total +monthAccumulation;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }
        System.out.println();

    }
    private static void task9() {
        System.out.println("Задача №9");
        double monthAccumulation = 29000;
        double total = 0;

        for( int i = 1;i < 13;i = i + 1){
            total = total +monthAccumulation;
            total = total * 1.12;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }

        System.out.println();

    }
    private static void task10() {
        System.out.println("Задача №10");
        int num = 2;
        int result;

        for( int i = 1;i < 11;i = i + 1){
            result = num * i;

            System.out.println(num + "*" + i + "=" + result);
        }

        System.out.println();

    }
}