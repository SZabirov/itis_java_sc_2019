package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String username = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        //создали объект-модель с нужными значениями полей
        User u = new User(username, password);
        //создали новый объект для работы с данными в файле
        UserDao dao = new UserDao();
        //вызываем метод для сохранения сущности, описанной
        //значениями полей в User'e
        dao.save(u);
    }
}
