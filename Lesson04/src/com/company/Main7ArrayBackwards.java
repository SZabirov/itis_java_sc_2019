package com.company;

import java.util.Scanner;

public class Main7ArrayBackwards {
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

        //вывод всех элементов массива в обратном порядке
        //то есть начиная с последнего
        c = n - 1;
        while (c >= 0) {
            System.out.println(arr[c]);
            c = c - 1;//c--;
        }
    }
}
