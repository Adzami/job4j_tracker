package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int totalSurgeries;
    private int patientsStillAlive;

    public Surgeon(String name) {
        super(name);
    }

    public int getTotalSurgeries() {
        return totalSurgeries;
    }

    public int getPatientsStillAlive() {
        return patientsStillAlive;
    }

    public void autopsy() {

    }

    public void reanimation() {

    }
}
