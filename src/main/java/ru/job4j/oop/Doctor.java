package ru.job4j.oop;

public class Doctor extends Profession {
    private long licenceNumber;
    private int rating;

    public long getLicenceNumber() {
        return licenceNumber;
    }

    public int getRating() {
        return rating;
    }

    public String diagnose() {
        return "";
    }

    public String giveRecipe() {
        return "";
    }
}
