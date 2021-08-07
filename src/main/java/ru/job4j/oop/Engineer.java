package ru.job4j.oop;

public class Engineer extends Profession {
    private String technoStack;
    private int yearsOfExperience;

    public Engineer(String name) {
        super(name);
    }

    public String getTechnoStack() {
        return technoStack;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String saySomethingSmart() {
        return "";
    }

    public int ultimateQuestion() {
        return 42;
    }
}
