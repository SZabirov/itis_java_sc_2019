package com.company;

//сортировка чисел методом выбора по убыванию
public class Main08SelectionSortDesc {
    public static void main(String[] args) {
        int[] arr = {0, 7, 1, 2, 5, 4, 7, 9, -2, -7};
        int n = arr.length;

        //j показывает, сколько элементов с конца стоят на своем месте
        for (int j = 0; j < n - 1; j++) {
            int indexOfMin = 0;
            //поиск минимального
            for (int i = 0; i < n - j; i++) {
                if (arr[i] < arr[indexOfMin]) {
                    indexOfMin = i;
                }
            }
            //обмен
            int b = arr[indexOfMin];
            arr[indexOfMin] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}







