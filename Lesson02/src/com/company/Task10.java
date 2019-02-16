package com.company;

import java.util.Scanner;

//пользователь вводит n. затем n штук натуральных чисел.
//вывести на экран максимальное из введенных чисел
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество чисел:");
        int n = scanner.nextInt();
        int c = 0;
        while (c < n) {
            int x = scanner.nextInt();
            c++;
        }
    }
}
