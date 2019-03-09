package com.company.version1;

public class Main1 {
    public static void main(String[] args) {
	    Pet p = new Pet();
	    p.name = "Барсик";
	    p.age = 2;
	    p.weight = 10.4;
	    p.eat("рыба");

	    Pet pet2 = new Pet();
	    pet2.name = "Жучка";
	    pet2.age = 5;
	    pet2.weight = 12;
	    pet2.sayHello();

	    double sum = p.weight + pet2.weight;
	    pet2.weight = pet2.weight + 1;
    }
}
