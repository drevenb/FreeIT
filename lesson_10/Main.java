package lesson_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Genre novel = new Genre("Novel");
        Genre horror = new Genre("Horror");
        Genre fantasy = new Genre("Fantasy");

        Book book1 = new Book("The Great Gatsby", novel);
        Book book2 = new Book("Gothic Tales", horror);
        Book book3 = new Book("The Witcher", fantasy);
        Book book4 = new Book("Dracula", horror);
        Book book5 = new Book("Brave New World", novel);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.getBooks().sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

        System.out.println("Books sorted by title:");
        for(Book book: library.getBooks()) {
            System.out.println(book);
        }

        library.removeBook(4);

        library.getBooks().sort(Comparator.comparing(Book::getID));

        System.out.println("\nBooks sorted by id:");
        for(Book book: library.getBooks()) {
            System.out.println(book);
        }

        book3.setTitle("The Bad Seed");
        book3.setGenre(horror);

        library.editBook(book3);

        System.out.println("\nOur final library:");
        for(Book book: library.getBooks()) {
            System.out.println(book);
        }
    }
}
