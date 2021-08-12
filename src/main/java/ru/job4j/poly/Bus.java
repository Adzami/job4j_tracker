package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void move() {
        System.out.println("Проезд оплачиваем!");
    }

    @Override
    public void passengers(int passengers) {
        if (passengers > 10) {
            System.out.println("Куда прешь, автобус не резиновый!");
        }
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 48;
    }
}
