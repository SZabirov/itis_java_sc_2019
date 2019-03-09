package com.company.cars;

public class Main {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar("red", 250);
        for (int i = 0; i < 50; i++) {
            rc.accelerate();
        }
        System.out.println(rc.getCurrentSpeed());
    }
}
