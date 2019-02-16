package com.company;

//посчитать произведение чисел от 3 до 11
public class Task6 {
    public static void main(String[] args) {
        int p = 1;//переменная для хранения произведения
        int c = 3;
        while (c <= 11) {
            p = p * c;
            c++; //то же самое, что с = с + 1;
        }
        System.out.println(p);
    }
}
