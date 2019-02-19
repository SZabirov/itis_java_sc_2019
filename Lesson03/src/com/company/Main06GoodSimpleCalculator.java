package com.company;

import java.util.Scanner;

public class Main06GoodSimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();//считываем первое число
        String operation = sc.next();//считываем знак
        double b = sc.nextDouble();//считываем второе число
        if (operation.equals("+")) {
            System.out.println(a + b);
        }
        if (operation.equals("-")) {
            System.out.println(a - b);
        }
        if (operation.equals("/")) {
            System.out.println(a / b);
        }
    }
}







