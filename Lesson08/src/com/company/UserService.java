package com.company;

import java.io.FileNotFoundException;

//класс-сервис. Содержит "бизнес-логику"
//отвечает за "логические ограничения"
//например, на уровне сервиса стоит проверить,
//выполняет ли пароль необходимые требования,
//а вот сохранение нового пароля в файл выполняем
//с помощью UserDao
public class UserService {
    UserDao dao = new UserDao();

    public void signUp(User u) throws FileNotFoundException {
        if (u.password.length() < 8) {
            System.out.println("Пароль " +
                    "не может быть короче 8 симв.");
        } else {
            dao.save(u);
        }
    }

    public void editMyself(User u) {

    }
}
