package com.company;

public class Main12Replace {
    public static void main(String[] args) {
        char[] symbols = {'8', 'a', 'o', '1', 'y', '4'};
        replace(symbols);
        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i]);
        }
    }

    //заменяет все цифры в массиве symbols на звездочку '*'
    static void replace(char[] symbols) {
        int n = symbols.length;
        for (int i = 0; i < n; i++) {
            char c = symbols[i];
            if (c >= '0' & c <= '9') {//если это цифра
                symbols[i] = '*';
            }
        }
    }
}
