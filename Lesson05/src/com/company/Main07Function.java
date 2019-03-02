package com.company;

public class Main07Function {
    public static void main(String[] args) {
        int x = 689;
        int y = 345;
        double summa = sum(x, y);
    }

    static double sum(double a, double b) {
        double s = a + b;
        return s;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}






