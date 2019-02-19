package com.company;

import java.util.Scanner;

/**
 * Принять число, вывести на экран информацию
 * о том, положительное, отрицательное или ноль
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;//объявление целочисленной переменной
        x = scan.nextInt();
        if (x > 0) {
            System.out.println("положительное");
        }
        if (x < 0) {
            System.out.println("отрицательное");
        }
        if (x == 0) {
            System.out.println("да это же ноль!");
        }
    }
}
