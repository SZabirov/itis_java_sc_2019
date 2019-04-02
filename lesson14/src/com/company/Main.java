package com.company;

public class Main {
    public static void main(String[] args) {
	    Office o = new Office();
	    Employee e1 = new Employee("Абдульманов", "Булат");
	    Employee e2 = new Employee("Яковлев", "Алмаз");
	    Employee e3 = new Employee("Гайфуллин", "Амир");
	    Employee e4 = new Employee("Кудашов", "Никита");
	    Employee e5 = new Employee("Тазеев", "Тимур");
	    Employee e6 = new Employee("Куликов", "Ярослав");
	    Employee e7 = new Employee("Ханеев", "Адель");
	    Employee e8 = new Employee("Сметанин", "Савелий");
	    o.addEmployee(e1);
	    o.addEmployee(e2);
	    o.addEmployee(e3);
	    o.addEmployee(e4);
	    o.addEmployee(e5);
	    o.addEmployee(e6);
	    o.addEmployee(e7);
	    o.addEmployee(e8);
	    o.addEmployee(new Employee("Мирсаитов", "Чингиз"));
	    o.addEmployee(new Employee("Мирсаитов", "Бахтияр"));
	    o.addEmployee(new Employee("Зиновьев", "Герман"));
	    o.addEmployee(new Employee("Ахметзянова", "Диана"));
	    o.addEmployee(new Employee("Шайдуллин", "Наиль"));
	    o.addEmployee(new Employee("Минсафин", "Айвар"));
	    o.printAll();
    }
}
