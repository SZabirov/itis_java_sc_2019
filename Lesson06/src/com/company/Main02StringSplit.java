package com.company;

public class Main02StringSplit {
    public static void main(String[] args) {
        //данные о погоде за 7 дней (за одну неделю)
        String s = "21 22 18 23 24 20 20";

        //массив строк
        String[] arr;

        //разбиваем строку по пробелам
        //результат работы split - это куски строки,
        //которые были отделены друг от друга некоторым
        //разделителем (например, пробелы или запятые и т. д.)
        arr = s.split(" ");

        int n = arr.length;

        System.out.println(n);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            //valueOf возвращает число, которое записано в строке str
            int temp = Integer.valueOf(str);
            sum = sum + temp; //sum += temp;
        }
        System.out.println(sum/7);
    }
}
