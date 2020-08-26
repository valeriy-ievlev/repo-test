package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
// типы данных в переменных и их инициализация
        byte a = 1;
        short b = 4;
        int c = 150;
        long e = 880000;
        float f = 13.3f;
        double d = 143.000087;
        char g = 'a';
        String h = "lesson1";
        boolean i = true;

// вызов методов
        task3(4, 34, 17, 38);
        task4(12, 15);
        task5(-3);
        task6(-90);
        task7("Валерий");
        task8(1200);
            }
// методы
    public static int task3 (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static boolean task4 (int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20) return true;
        else return false;
    }
    public static void task5 (int a){
        if (a < 0)
            System.out.println("число " + a + " отрицательное");
        else System.out.println("число " + a + " положительное");
    }
    public static boolean task6 (int a){
        if (a < 0) return true;
        else return false;
    }
    public static void task7 (String name){
        System.out.println("Привет " + name);
    }
    public static void task8 (int year){
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0))){
            System.out.println("Год " + year + " Высокосный");
                  }
        else System.out.println("Год " + year + " не высокосный");
    }
}
