package com.company;

import java.util.Scanner;

//пользователь вводит n. затем n штук чисел.
//вывести на экран произведение данных n чисел,
//которые ввел пользователь
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество чисел:");
        int n = scanner.nextInt();
        int p = 1;
        int c = 0;
        while (c < n) {
            int x = scanner.nextInt();
            p = p * x;
            c++;
        }
    }
}
