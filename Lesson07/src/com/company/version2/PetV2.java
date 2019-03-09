package com.company.version2;

public class PetV2 {
    public int age;
    public String name;
    public double weight;

    //конструктор класса
    public PetV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat(String food) {
        System.out.println("Съел " + food);
    }

    public void sayHello() {
        System.out.println("Привет, я - " + name);
    }
}
