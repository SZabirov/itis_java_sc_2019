package com.company;

import java.util.Scanner;

public class Main05BadSimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operation = sc.next();
        int b = sc.nextInt();
        if (operation.equals("+")) {
            System.out.println(a + b);
        }
        if (operation.equals("-")) {
            System.out.println(a - b);
        }
        //такое деление будет "отбрасывать" дробную часть
        //в таком случае при 9 / 2 получим 4
        if (operation.equals("/")) {
            System.out.println(a / b);
        }
    }
}







