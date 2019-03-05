package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main05ReadFileProductCost {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            System.out.println(arr[1] + " стоит " + arr[3]);
        }
    }
}




