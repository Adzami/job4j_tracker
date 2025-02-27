package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Вместимость автобуса " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 50;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.passengers(30);
        System.out.println("Заправка будет стоить " + bus.refuel(60) + " руб.");
        bus.move();
    }
}
