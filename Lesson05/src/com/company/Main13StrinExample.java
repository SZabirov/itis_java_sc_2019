package com.company;

public class Main13StrinExample {
    public static void main(String[] args) {
        String s = "abc123123";
        //получение массива символов из строки
        char[] symbols = s.toCharArray();
        System.out.println(symbols[2]);
        System.out.println(symbols[4]);

        char[] arr = {'h', 'e', 'l', 'p'};
        //получение из массива символов строки
        String string = new String(arr);
    }
}
