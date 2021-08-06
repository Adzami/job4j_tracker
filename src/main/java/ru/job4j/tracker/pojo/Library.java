package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        book1.setName("Clean code");
        book1.setPages(500);
        book2.setName("Hitchhiker's guide");
        book2.setPages(350);
        book3.setName("Head First Java");
        book3.setPages(450);
        book4.setName("Guards! Guards!");
        book4.setPages(300);
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
