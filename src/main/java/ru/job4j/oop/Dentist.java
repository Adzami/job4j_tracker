package ru.job4j.oop;

public class Dentist extends Doctor {
    private int averageBill;
    private String catchPhrase;

    public int getAverageBill() {
        return averageBill;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public long makeBill() {
        return Long.MAX_VALUE;
    }

    public void comfort() {
        System.out.println(this.catchPhrase);
    }
}
