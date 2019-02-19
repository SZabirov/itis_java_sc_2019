package com.company;

import java.util.Scanner;

public class Main02ReadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.next();
        System.out.println("Привет, " + name);
    }
}








