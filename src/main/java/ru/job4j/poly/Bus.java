package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void move() {
        System.out.println("Проезд оплачиваем!");
    }

    @Override
    public void passengers(int passengers) {

    }

    @Override
    public int refuel(int fuel) {
        return 0;
    }
}
