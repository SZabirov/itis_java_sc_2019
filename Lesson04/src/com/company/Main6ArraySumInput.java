package com.company;

import java.util.Scanner;

//пользователь вводит n, заводим массив на n элементов
//затем считаем сумму элементов массива
public class Main6ArraySumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Вводите все числа по очереди");
        int c = 0;
        while (c < n) {
            int x = sc.nextInt();
            arr[c] = x;
            c++;
        }

        int sum = 0;
        int i = 0;
        //в цикле перебираем все элементы массива, начиная с элемента под индексом 0
        //к вычисленной ранее сумме добавляем очередное значение
        while (i < n) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Сумма = " + sum);
    }
}









