package lesson_10;

import java.io.*;
import java.util.*;

public class Application {

    private Library library;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Application(Library library) {
        this.library = library;
    }

    public void start() {
        boolean isExit = false;

        try {
            while (!isExit) {
                System.out.println("Choose an action:");
                System.out.println("\t1 - print all the books");
                System.out.println("\t2 - add a book");
                System.out.println("\t3 - delete a book");
                System.out.println("\t4 - edit a book");
                System.out.println("\texit - exit from the programme");

                String choice = reader.readLine();

                switch(choice) {
                    case("1"):
                        printAllBooks();
                        break;
                    case("2"):
                        addBook();
                        break;
                    case("3"):
                        removeBook();
                        break;
                    case("4"):
                        editBook();
                        break;
                    case("exit"):
                        isExit = true;
                        break;
                    default:
                        System.out.println("You have chosen irregular command.");
                        break;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void printAllBooks() throws IOException {
        System.out.println("Sort by:");
        System.out.println("\t1 - alphabet ascending");
        System.out.println("\t2 - alphabet descending");
        System.out.println("\t3 - adding order(old first)");
        System.out.println("\t4 - adding order(new first)");

        String choice = reader.readLine();

        switch(choice) {
            case("1"):
                library.getBooks().sort((o1, o2) -> (o1.getTitle().compareTo(o2.getTitle())));
                for(Book book: library.getBooks()) {
                    System.out.println(book);
                }
                break;
            case("2"):
                library.getBooks().sort((o1, o2) -> (o2.getTitle().compareTo(o1.getTitle())));
                for(Book book: library.getBooks()) {
                    System.out.println(book);
                }
                break;
            case("3"):
                library.getBooks().sort((o1, o2) -> o1.getID() - o2.getID());
                for(Book book: library.getBooks()) {
                    System.out.println(book);
                }
                break;
            case("4"):
                library.getBooks().sort((o1, o2) -> o2.getID() - o1.getID());
                for(Book book: library.getBooks()) {
                    System.out.println(book);
                }
                break;
            default:
                System.out.println("You have chosen irregular command.");
                break;
        }

    }

    private void addBook() throws IOException {
        System.out.print("Enter the title of a book: ");
        String title = reader.readLine();

        System.out.print("Enter genre of a book: ");
        String genre = reader.readLine();

        if(library.getBooks().size() == 0) {
            library.addBook(new Book(title, new Genre(genre)));
        } else {
            ListIterator<Book> iterator = library.getBooks().listIterator();

            while(iterator.hasNext()) {
                if(iterator.next().getTitle().toLowerCase().equals(title.toLowerCase())) {
                    System.out.println("This book is already exist in the library.");
                    return;
                }
            }
            iterator.add(new Book(title, new Genre(genre)));
        }
    }

    private void removeBook() {
        try {
            System.out.print("Enter id of the book you want to delete: ");
            int id = Integer.parseInt(reader.readLine());

            if(library.removeBook(id)) {
                System.out.println("The book was deleted.");
                Book.countID--;
            } else {
                System.out.println("There isn't such id of the book in the library. Try again.");
                removeBook();
            }
        } catch(NumberFormatException e) {
            System.out.println("You must enter a number!");
            removeBook();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void editBook() {
        try {
            boolean isBookExist = false;
            do {
                System.out.print("Enter id of the book you want to edit: ");
                int id = Integer.parseInt(reader.readLine());

                for (Book book : library.getBooks()) {
                    if (book.getID() == id) {
                        isBookExist = true;
                    }
                }

                if(isBookExist) {
                    System.out.print("Enter new title: ");
                    String title = reader.readLine();

                    System.out.print("Enter new genre: ");
                    String genre = reader.readLine();

                    library.editBook(new Book(id, title, new Genre(genre)));
                } else {
                    System.out.println("There isn't such id of the book in the library. Try again.");
                }
            } while(!isBookExist);

        } catch(NumberFormatException e) {
            System.out.println("You must enter a number!");
            editBook();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
