package com.company;

import java.util.Scanner;

public class Main09Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        System.out.println("Введите степень:");
        int p = sc.nextInt();
        //нужно вычислить значение x, умноженное
        //само на себя p раз

        int c = 0;
        int result = 1;
        while (c < p) {
            result = result * x;
            c = c + 1;
        }
    }
}








