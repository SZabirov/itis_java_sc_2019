package com.company;

public class Main3Array {
    public static void main(String[] args) {
        int x = 5;//переменная, хранит одно число
        int[] a = new int[5];//объявление массива для 5 элементов
        a[0] = 1;//присвоение значения ячейке с индексом 0
        a[1] = 3;
        a[4] = 42;
        int c = a[1];//в переменную c записали значение ячейки массива a с индексом 1
        System.out.println(c);
        System.out.println(a[0]);//вывод содержимого 0-ой ячейки массива
        System.out.println(a[1]);
    }
}
