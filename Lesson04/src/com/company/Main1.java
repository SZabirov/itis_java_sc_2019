package com.company;

public class Main1 {
    public static void main(String[] args) {
	    boolean b = true;
	    boolean a = false;

	    boolean bolshe = 3 > 2;
        System.out.println(bolshe);

        boolean ravno = (5 == 5);//будет true, если 5 равно 5

        boolean e = (a == b);//т к значения a и b различаются. то переменная e примет false

        boolean prodolzhat = true;
        int x = 0;
        while (prodolzhat) {
            if (x > 10) {
                prodolzhat = false;
            }
            System.out.println(x + "цикл продолжается");
            x++;
        }
    }
}
