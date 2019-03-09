package com.company.version1;

public class Pet {
    public int age;
    public String name;
    public double weight;

    void eat(String food) {
        System.out.println("Съел " + food);
    }

    public void sayHello() {
        System.out.println("Привет, я - " + name);
    }

    public void sayAge() {
        System.out.println("Мне " + age + " лет");
    }
}
