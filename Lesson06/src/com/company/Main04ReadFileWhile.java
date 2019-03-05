package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04ReadFileWhile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}




