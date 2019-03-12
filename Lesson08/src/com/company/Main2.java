package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String username = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        User u = new User(username, password);
        UserService service = new UserService();
        service.signUp(u);
    }
}
