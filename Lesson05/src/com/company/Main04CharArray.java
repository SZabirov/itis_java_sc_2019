package com.company;

public class Main04CharArray {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < arr.length; i++) {
            char symbol = arr[i];
            int x = symbol - 32;
            //приведение типа.
            //явно преобразовали значение типа int в char
            char bigSymbol = (char) x;
            System.out.println(bigSymbol);
        }
    }
}
