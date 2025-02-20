package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 123);
        Book book2 = new Book("Nevermore", 25);
        Book book3 = new Book("Harry and Potter", 321);
        Book book4 = new Book("Darkest Hour", 222);
        Book[] books = new Book[] {
                book1, book2, book3, book4
        };
        for (Book book : books) {
            System.out.println(book.getName() + " has " + book.getPages() + " pages");
        }
        Book bookTmp = books[0];
        books[0] = books[3];
        books[3] = bookTmp;
        for (Book book : books) {
            System.out.println(book.getName() + " has " + book.getPages() + " pages");
        }
        for (Book book : books) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " has " + book.getPages() + " pages");
            }
        }
    }
}
