package com.company;

import java.util.ArrayList;

public class SumOfListWithNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list =
                new ArrayList<>();
        list.add(42);
        list.add(45);
        list.add(43);
        int length = list.size();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}
