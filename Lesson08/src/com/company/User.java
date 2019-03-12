package com.company;

//класс-модель - представляет некоторую сущность
//(часто представляет некоторый реальный объект)
//главная задача - хранить данные
public class User {
    long id;
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
