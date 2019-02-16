package com.company;

import java.util.Scanner;

//Пользователь вводит 10 чисел
//посчитать их сумму
public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int c = 0;
        while (c < 10) {
            int x = scan.nextInt();
            sum = sum + x;
            c++;
        }
    }
}
