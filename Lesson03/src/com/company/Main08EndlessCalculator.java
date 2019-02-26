package com.company;

import java.util.Scanner;

public class Main08EndlessCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        double result = 0.0;
        int deleteResult = 1; //0 - значит продолжить, 1 - значит сбросить
        while (c < 1) {
            double a;
            if (deleteResult == 0) {//если продолжаем, то в качестве первого аргумента a используем прошлый результат
                a = result;
            } else {//если надо сбросить, то заново считываем первый аргумент
                a = sc.nextDouble();
            }
            String operation = sc.next();
            double b = sc.nextDouble();
            if (operation.equals("-")) {
                result = a - b;
                System.out.println(result);
            }
            if (operation.equals("+")) {
                result = a + b;
                System.out.println(result);
            }
            if (operation.equals("*")) {
                result = a * b;
                System.out.println(result);
            }
            if (operation.equals("/")) {
                result = a / b;
                System.out.println(result);
            }
            if (operation.equals("^")) {
                int i = 0;
                result = 1;
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
            } else {
                System.out.println("введите 1 для сброса " +
                        "или введите 0 для продолжения с полученным результатом");
                deleteResult = sc.nextInt();
            }
        }
    }
}
