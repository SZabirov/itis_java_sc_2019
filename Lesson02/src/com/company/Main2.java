package com.company;

import java.util.Scanner;

/**
 * Принять число, вывести на экран информацию
 * о том, положительное, отрицательное или ноль
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;//объявление целочисленной переменной
        x = scan.nextInt();
        if (x > 0) {
            System.out.println("положительное");
        } else {
            if (x == 0) {
                System.out.println("это ноль");
            } else {
                System.out.println("отрицательное");
            }
        }
    }
}
