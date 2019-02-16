package com.company;

public class Delenie {
    //psvm
    public static void main(String[] args) {
        int s = 4510;
        int a1000 = s / 1000;
        System.out.println(a1000 + " по 1000 р");

        s = s - a1000 * 1000;//сколько еще не выдали тысячными купюрами
        int a500 = s / 500;
        System.out.println(a500 + " по 500 р");
    }
}




