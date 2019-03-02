package com.company;

import java.util.Scanner;

public class Main14Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String newStr = toUpperCase(s);
        System.out.println(newStr);
    }

    //"ab1cDeR" -> "AB1CDER"
    //возвращает новую строку, содержащую те же
    //символы, что и s, только все в заглавном регистре
    static String toUpperCase(String s) {
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] >= 'a' & symbols[i] <= 'z') {
                symbols[i] = (char) (symbols[i] - 32);
            }
        }
        String result = new String(symbols);
        return result;
    }
}






