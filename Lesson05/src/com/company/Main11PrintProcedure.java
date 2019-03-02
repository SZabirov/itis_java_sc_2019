package com.company;

public class Main11PrintProcedure {
    public static void main(String[] args) {
        int[] array = {42, 56, 1, 89, 907, 35};
        printArr(array);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
