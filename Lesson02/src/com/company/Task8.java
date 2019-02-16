package com.company;

import java.util.Scanner;

//Пользователь вводит n, затем по очереди n штук чисел
//Посчитать сумму введенных чисел
public class Task8 {
    public static void main(String[] args) {
        System.out.println("сколько чисел?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int c = 0;
        while (c < n) {
            int x = sc.nextInt();
            sum = sum + x;
            c++;
        }
        System.out.println(sum);
    }
}
