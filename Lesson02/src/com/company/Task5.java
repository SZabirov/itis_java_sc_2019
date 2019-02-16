package com.company;

//Посчитать сумму чисел от 150 до 300
public class Task5 {
    public static void main(String[] args) {
        int sum = 0;//переменная для подсчета суммы
        int c = 150;//счетчик - хранит текущее число
        while (c <= 300) {
            sum = sum + c;//прибавляем к имеющейся сумме текущее число
            c = c + 1;
        }
    }
}
