package com.company;

import java.util.Scanner;

//пользователь вводит n, заводим массив на n элементов
//считываем все значения в массив
//вывести наибольшее значение, которое ввел пользователь
//(то есть максимальный элемент массива)
//А также вывести индекс максимального элемент
//{6, 8, 1, 4, 5, 6}
//Ответ: максимальный: 8. Индекс макс. элемента: 1
public class Main8ArrayIndexOfMax {
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

        int indexOfMax = 0;//предположим, что 0-ой элемент из массива и есть максимальный
        int i = 0;
        while (i < n) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            }
            i++;
        }
        System.out.println("Индекс макс. элемента " + indexOfMax);
        System.out.println("Макс. значение: " + arr[indexOfMax]);
    }
}







