package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    Error() {
    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println(this.active + "\n" + this.status + "\n" + this.message + "\n");
    }

    public static void main(String[] args) {
        Error emptyError = new Error();
        emptyError.showInfo();
        Error error = new Error(true, 1, "О ужас, все сломалось!");
        error.showInfo();
    }
}
