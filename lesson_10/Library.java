package lesson_10;

import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        ListIterator<Book> iterator = books.listIterator();

        if(books.size() == 0) {
            books.add(book);
        } else {
            while(iterator.hasNext()) {
                Book anotherBook = iterator.next();

                if(anotherBook.getID() == book.getID()) {
                    System.out.println("This book is already exist in the library.");
                    return;
                }
            }
            iterator.add(book);
        }
    }

    public ArrayList<Book> getBooks() { return books; }

    public boolean removeBook(int id) {
        ListIterator<Book> iterator = books.listIterator();

        while(iterator.hasNext()) {
            if(iterator.next().getID() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void editBook(Book book) {
        ListIterator<Book> iterator = books.listIterator();

        while(iterator.hasNext()) {
            if(iterator.next().getID() == book.getID()) {
                iterator.set(book);
            }
        }
    }
}
