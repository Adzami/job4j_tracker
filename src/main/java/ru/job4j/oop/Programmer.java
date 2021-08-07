package ru.job4j.oop;

public class Programmer extends Engineer {
    private String programmingMainLanguage;
    private String prefersDB;

    public Programmer(String name) {
        super(name);
    }

    public String getProgrammingMainLanguage() {
        return programmingMainLanguage;
    }

    public String getPrefersDB() {
        return prefersDB;
    }

    public void doTask() {

    }

    public boolean meetDeadline() {
        return false;
    }
}
