package com.company;

public class Office {
    //final - нельзя изменить значение переменной
    private final int MAX_INITIAL_COUNT = 10;
    private String name;
    private int count = 0;
    private Employee[] employees = new Employee[MAX_INITIAL_COUNT];

    void addEmployee(Employee e) {
        //если массив полностью заполнен
        if (count == employees.length) {
            //тогда заводим новый массив и копируем
            //значения из старого
            Employee[] newArray =
                    new Employee[employees.length * 2];
            for (int i = 0; i < employees.length; i++) {
                newArray[i] = employees[i];
            }
            employees = newArray;
        }
        employees[count] = e;
        count++;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getFirstname());
        }
    }
}
