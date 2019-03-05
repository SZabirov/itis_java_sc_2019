package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Представим, что магазин был ограблен, и все продукты
 * были украдены. Но остался файл product.txt.
 * Выведите на экран, какой ущерб нанесло ограбление,
 * то есть суммарную стоимость всех хранившихся в магазине
 * товаров.
 */
public class Main06SadTask {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("products.txt");
        Scanner scanner = new Scanner(f);
        int sum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            String strCount = elements[2];//количество в виде строки
            String strCost = elements[3];//стоимость в виде строки
            int count = Integer.valueOf(strCount);
            int cost = Integer.valueOf(strCost);
            sum = sum + count * cost;
        }
        System.out.println(sum);
    }
}









