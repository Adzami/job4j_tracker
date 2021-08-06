package ru.job4j.tracker.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Active: " + this.active);
        System.out.println("Status: " + this.status);
        System.out.println("Message: " + this.message + "\n");
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error err2 = new Error(true, 404, "Page not found");
        Error err3 = new Error(false, 500, "Server down, try again later");
        err1.printError();
        err2.printError();
        err3.printError();
    }
}
