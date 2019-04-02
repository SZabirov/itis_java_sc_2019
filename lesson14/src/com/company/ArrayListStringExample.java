package com.company;

import java.util.ArrayList;

public class ArrayListStringExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("oiwowoeijw");
        list.add("qretqewr");
        list.add("aaa");
        System.out.println(list);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ADKJFSDFJ");
        strings.add("ADKJFSDFJLDKJfSJ");
        list.addAll(strings);//добавление в список list всего содержимого списка strings
        list.remove("ADKJFSDsdfJ");//удаление по значению
        list.set(2, "42");//изменение значения элемента с индексом 2
        System.out.println(list);
    }
}
