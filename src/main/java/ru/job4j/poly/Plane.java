package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Экипаж прощается с вами, счастливого полета.");
    }
}
