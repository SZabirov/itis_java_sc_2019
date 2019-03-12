package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//класс, который отвечает за то, чтобы отдать
//следующий свободный id, и записать в файл
//созданный id. Таким образом в файле каждый
//раз хранится последний использованный id
public class IdGenerator {
    public long nextId() throws FileNotFoundException {
        Scanner sc = new Scanner(
                new File("id_generator.txt"));
        long id = sc.nextLong();
        sc.close();
        long newId = id + 1;
        PrintWriter pw = new PrintWriter(
                new File("id_generator.txt"));
        pw.println(newId);
        pw.close();
        return newId;
    }
}
