package com.company;

import java.util.Scanner;

public class Main01Homework05 {
    public static void main(String[] args) {
	    Scanner sc = new
                Scanner(System.in);
	    String s = sc.nextLine();//считали строку в переменную s
        char[] symbols = s.toCharArray();//из s получили массив её символов
        //в цикле сравниваем текущий элемент со следующим
        //в случае совпадения меняем оба на *
        //цикл заканчиваем на предпоследнем элементе,
        //так как у последнего нет следующего, чтобы их сравнить
        for (int i = 0; i < symbols.length - 1; i++) {
            //если текущий совпал со следующим за ним
            if (symbols[i] == symbols[i + 1]) {
                symbols[i] = '*';
                symbols[i + 1] = '*';
            }
        }
        s = new String(symbols);//получили из символов снова строку и записали в ту же переменную s
        System.out.println(s);
    }
}
