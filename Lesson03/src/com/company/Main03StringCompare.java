package com.company;

import java.util.Scanner;

//сравнение двух строк
public class Main03StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.next();
        //вариант НЕПРАВИЛЬНЫЙ
        //сравнивать строки через == нельзя!!!
        if (name == "Салават") {
            System.out.println("О, привет!!!");
        } else {
            System.out.println("Добрый день, " + name);
        }
    }
}
