package com.company.cars;

public class RacingCar {
    String color;
    private int currentSpeed;
    int maxSpeed;

    public RacingCar(String color,
                     int maxSpeed) {
        this.color = color;
        this.currentSpeed = 0;
        this.maxSpeed = maxSpeed;
    }

    void accelerate() {
        if (currentSpeed + 10 <= maxSpeed) {
            currentSpeed += 10;
        } else {
            System.out.println("Нельзя быстрее:(");
        }
    }

    //метод, который возвращает значение currentSpeed
    //такой метод - метод доступа к значению - называется "геттер"
    int getCurrentSpeed() {
        return currentSpeed;
    }
}
