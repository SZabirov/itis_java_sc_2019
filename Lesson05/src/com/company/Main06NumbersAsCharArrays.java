package com.company;

public class Main06NumbersAsCharArrays {
    public static void main(String[] args) {
        char[] num1 = {'4', '7', '1', '8', '6'};
        char[] num2 = {'6', '8', '3'};

        int x1 = 0;
        int mnozhitel = 1;
        for (int i = num1.length - 1; i >= 0; i--) {
            x1 = x1 + (num1[i] - '0') * mnozhitel;
            mnozhitel = mnozhitel * 10;
        }

        int x2 = 0;
        mnozhitel = 1;
        for (int i = num2.length - 1; i >= 0; i--) {
            x2 = x2 + (num2[i] - '0') * mnozhitel;
            mnozhitel = mnozhitel * 10;
        }

        System.out.println(x1 + x2);
        //47186 + 683
    }
}
