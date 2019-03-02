package com.company;

//пример использования цикла for
//для подсчета суммы элементов массива
public class Main02For {
    public static void main(String[] args) {
        int[] arr = {8, 9, 42, 87, 2};
        int n = arr.length;
        int sum = 0;
        //пример цикла for
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}






