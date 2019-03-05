package com.company;

public class Main07SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 7, 1, 2, 5, 4, 7, 9, -2, -7};
        int n = arr.length;

        //j показывает, сколько элементов с конца стоят на своем месте
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            //обмен
            int b = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}







