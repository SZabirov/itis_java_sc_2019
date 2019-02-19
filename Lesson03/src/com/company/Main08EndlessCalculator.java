package com.company;

import java.util.Scanner;

public class Main08EndlessCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (c < 1) {
            double a = sc.nextDouble();
            String operation = sc.next();
            double b = sc.nextDouble();
            if (operation.equals("-")) {
                System.out.println(a - b);
            }
            if (operation.equals("+")) {
                System.out.println(a + b);
            }
            if (operation.equals("*")) {
                System.out.println(a * b);
            }
            if (operation.equals("/")) {
                System.out.println(a / b);
            }
            if (operation.equals("^")) {
                int i = 0;
                double result = 1;
                while (i < b) {
                    result = result * a;
                    i = i + 1;
                }
                System.out.println(result);
            }
            System.out.println("введите 1 для остановки " +
                    "или введите 0 для продолжения");
            int x = sc.nextInt();
            if (x == 1) {
                c = 2;
            }
        }
    }
}
