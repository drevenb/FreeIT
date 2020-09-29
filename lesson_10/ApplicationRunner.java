package lesson_10;

public class ApplicationRunner {
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

        Application app = new Application(library);
        app.start();
    }
}
