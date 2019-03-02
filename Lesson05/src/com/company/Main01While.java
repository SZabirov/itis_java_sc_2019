package com.company;

//пример цикла while для прохода по массиву
//для подсчета суммы
public class Main01While {
    public static void main(String[] args) {
        //объявил массив из трех чисел
        int[] arr = {8, 9, 42, 87, 2};
        int n = arr.length;//в переменной n количество элементов в массиве
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Сумма: " + sum);
    }
}








