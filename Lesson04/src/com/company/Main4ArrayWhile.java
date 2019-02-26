package com.company;

public class Main4ArrayWhile {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 67;
        arr[1] = 7;
        arr[2] = 45;
        arr[3] = 1;
        arr[4] = 10000;

//        int i = 0;
//        System.out.println(arr[i]);

        int c = 0;
        //способ вывести значение всех 5 элементов массива
        while (c < 5) {
            System.out.println(arr[c]);
            c++;
        }
    }
}









