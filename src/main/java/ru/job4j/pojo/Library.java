package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 500);
        Book book2 = new Book("Hitchhiker's guide", 350);
        Book book3 = new Book("Head First Java", 450);
        Book book4 = new Book("Guards! Guards!", 300);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book name: \"" + books[i].getName() + "\", pages: " + books[i].getPages());
        }
        System.out.println(System.lineSeparator());
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book book : books) {
            System.out.println("Book name: \"" + book.getName() + "\", pages: " + book.getPages());
        }
        System.out.println(System.lineSeparator());
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book name: \"" + book.getName() + "\", pages: " + book.getPages());
            }
        }
    }
}
