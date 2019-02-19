package com.company;

import java.util.Scanner;
//считаем среднее значени введенных чисел (всего n штук)
public class Main07Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();//записываем количество вводимых чисел
        double sum = 0;//заводим переменную для хранения суммы
        int c = 0;//счетчик, показывает сколько чисел уже обработали
        while (c < n) {
            System.out.println("Введите следующее число");
            int x = sc.nextInt();//считываем очередное число из консоли
            sum = sum + x;
            c++;//прибавляем к c единицу
        }
        double avg = sum / n;
        System.out.println("Среднее: " + avg);
    }
}















