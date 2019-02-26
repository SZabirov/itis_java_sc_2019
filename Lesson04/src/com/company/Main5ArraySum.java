package com.company;

//подсчет суммы элементов массива
public class Main5ArraySum {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 42;    arr[1] = 15;
        arr[2] = 3;     arr[3] = 54;
        arr[9] = 56;    arr[8] = 6;

        int sum = 0;
        int i = 0;
        //в цикле перебираем все элементы массива, начиная с элемента под индексом 0
        //к вычисленной ранее сумме добавляем очередное значение
        while (i < n) {
            sum = sum + arr[i];
            i++;
        }
    }
}









