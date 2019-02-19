package com.company;

import java.util.Scanner;

public class Main04StringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.next();
        //правильный способ сравнения строк
        if (name.equals("Салават")) {
            System.out.println("О, привет!!!");
        } else {
            System.out.println("Добрый день, " + name);
        }
    }
}
