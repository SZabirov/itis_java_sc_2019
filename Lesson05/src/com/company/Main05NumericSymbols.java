package com.company;

public class Main05NumericSymbols {
    public static void main(String[] args) {
        char[] symbols = {'4', '7', '1', '8', '6'};
        for (int i = 0; i < symbols.length; i++) {
            char s = symbols[i];
            int x = s - '0';//int x = s - 48;
            System.out.println(x);
        }
    }
}










