package com.company;

public class Main10NumbersAsCharArrays {
    public static void main(String[] args) {
        char[] num1 = {'4', '7', '1', '8', '6'};
        char[] num2 = {'6', '8', '3'};
        char[] num3 = {'5', '8', '3', '7'};

        int x1 = toInteger(num1);
        int x2 = toInteger(num2);
        int x3 = toInteger(num3);

        System.out.println(x1 + x2 + x3);
        //47186 + 683
    }

    //функция для получения числа из массива цифр
    static int toInteger(char[] symbols) {
        int x = 0;
        int mnozhitel = 1;
        for (int i = symbols.length - 1; i >= 0; i--) {
            x = x + (symbols[i] - '0') * mnozhitel;
            mnozhitel = mnozhitel * 10;
        }
        return x;
    }
}










