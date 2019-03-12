package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

//data access object - объект доступа
//к данным
//содержит методы для работы
//непосредственно с данными: сохранение,
//получение, обновление, удаление
public class UserDao {
    String fileName = "user_data.txt";
    IdGenerator generator = new IdGenerator();

    void save(User u) throws FileNotFoundException {
        File f = new File(fileName);
        FileOutputStream fos = new FileOutputStream(f, true);
        PrintWriter pw = new PrintWriter(fos);
        long id = generator.nextId();
        pw.println(id + " " + u.username + " " + u.password);
        pw.flush();
        pw.close();
    }

    User find(long id) {
        return null;
    }
}
