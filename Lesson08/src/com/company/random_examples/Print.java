package com.company.random_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("abc.txt");
        PrintWriter pw = new PrintWriter(f);
        for (int i = 1; i <= 10000; i++) {
            pw.println(i);
        }
        pw.flush();//принудительный сброс из буфера
        pw.close();
    }
}
