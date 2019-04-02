package com.company;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList - список, хранящий значения
        //в массиве. Хранит в себе массив, который
        //в случае надобности "расширяет" - то есть
        //заводит новый побольше и копирует в него
        //всё из старого.
        ArrayList<Employee> employees =
                new ArrayList<>();
        Employee e1 = new Employee("Абдульманов", "Булат");
        employees.add(e1);
        Employee e2 = new Employee("Яковлев", "Алмаз");
        employees.add(e2);
        Employee e3 = new Employee("Гайфуллин", "Амир");
        employees.add(e3);
        Employee e4 = new Employee("Кудашов", "Никита");
        Employee e5 = new Employee("Тазеев", "Тимур");
        Employee e6 = new Employee("Куликов", "Ярослав");
        Employee e7 = new Employee("Ханеев", "Адель");
        Employee e8 = new Employee("Сметанин", "Савелий");
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);

        System.out.println(employees.get(4).getFirstname());

    }
}
