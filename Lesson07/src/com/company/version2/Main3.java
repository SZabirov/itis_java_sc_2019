package com.company.version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//пример с уже известными классами
public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("info.txt");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(f);
    }
}












