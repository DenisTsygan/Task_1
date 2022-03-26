package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task_46();
        Task_71();
        Task_96();
        Task_121();
        Task_146();
    }
    /**
     * Найти:
     * а) сумму квадратов всех целых чисел от 10 до 50;
     * б) сумму квадратов всех целых чисел от а до 50 (значение а вводится с клавиатуры; а ≤ 50);
     * в) сумму квадратов всех целых чисел от a до b (значение b вводится с клавиатуры; b ≥ –10);
     * г) сумму квадратов всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).
     */
    private static void Task_46() {
        //а)-----------------------------------------------------------
        int sum_1 = 0;
        for (int i = 10; i <= 50; i++) {
            sum_1 += i * i;
        }
        System.out.println("a)" + sum_1);
        //б)----------------------------------------------------------
        int sum_2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите от какого числа расcчитывать сумму квадратов до 50(ваше число должно быть<=50):");
        int a = scanner.nextInt();
        if (a <= 50) {
            for (; a <= 50; a++) {
                sum_2 += a * a;
            }
            System.out.println("б)" + sum_2);
        } else System.out.println("ваше число должно быть<=50!!!");
        //в)----------------------------------------------------------
        int sum_3 = 0;
        System.out.println("Введите до какого числа расcчитывать сумму квадратов от -10(ваше число должно быть ≥ –10):");
        int b = scanner.nextInt();
        if(b>=-10){
            for (int i=-10; i <= b; i++) {
                sum_3 += i * i;
            }
            System.out.println("в)" + sum_3);
        }
        else System.out.println("ваше число должно быть≥ –10!!!");
        //г)----------------------------------------------------------
        int sum_4=0;
        System.out.println("Введите от какого числа расcчитывать сумму квадратов:");
        int x = scanner.nextInt();
        System.out.println("Введите до какого числа расcчитывать сумму квадратов :");
        int y = scanner.nextInt();
        for (;x <= y;x++){
            sum_4 +=x*x;
        }
        System.out.println("г)" + sum_4);
    }

    /**
     * Определить суммарный объем в литрах 12 вложенных друг в друга шаров со стенками толщиной 5 мм.
     * Внутренний диаметр внутреннего шара равен 10 см. Считать, что шары вкладываются друг в друга без зазоров.
     */
    private static void Task_71() {
        float volume=0;
        float radius=5;
                for(int i=0;i<=12;i++){
                    volume += (4*Math.PI*Math.pow(i*0.5+radius,3))/3;
                }
                System.out.println("Объем равен="+volume/1000+"(л)");//Мы нашли см^3 и перевели в литры

    }
    /**Вводятся известные оценки двух учеников по четырём предметам.
     * Определить, какой ученик лучше учится.
     */
    private static void Task_96() {
        System.out.println("Введите оценки первого ученика:");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        System.out.println("Введите оценки второго ученика:");
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int b4 = scanner.nextInt();
        float average_mark_1=(float)(a1+a2+a3+a4)/4;
        float average_mark_2=(float)(b1+b2+b3+b4)/4;
        if(average_mark_1>average_mark_2){
            System.out.println("Первый ученик учится лучше второго");
        }
        else if(average_mark_1<average_mark_2){
            System.out.println("Второй ученик учится лучше первого");
        }
        else{
            System.out.println("Первый и второй ученик учится на равне друг с другом");
        }
    }/**
     Составить программу, которая запрашивает пароль (например, четырёхзначное число) до тех пор,
     пока он не будет введён правильно.
     */
    private static void Task_121() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите паль из 4 цифр:");
        int pasword = 0;
        while(scanner.hasNextInt()){
            pasword = scanner.nextInt();
            String s = Integer.toString(pasword);
            if(s.length() == 4){
                pasword = Integer.valueOf(s);
                System.out.println("Ваш пароль: " + pasword);
                break;
            }else{
                System.out.println("Пароль должнет состоять из 4 цифр!\nПопробуйте снова:");

        }
    }

}/**Христиан Гольдбах выдвинул гипотезу о том, что любое чётное число, большее 2, представимо в виде суммы двух простых чисел.
     Проверьте эту гипотезу Гольдбаха для всех чётных чисел, не превышающих число 50.
     */
    private static void Task_146() {
        int[] arr= new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        for(int i=4;i<=50;i+=2) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i == (arr[j] + arr[k])) {
                        System.out.println(i + "=" + arr[j] + "+" + arr[k] + ";");
                    }
                }
            }
        }
    }
}


