package lesson_10;

public class Book {
    private int id;
    private String title;
    private Genre genre;
    public static int countID;

    public Book(String title, Genre genre) {
        this.id = ++countID;
        this.title = title;
        this.genre = genre;
    }

    public Book(int id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getID() { return id; }

    public void setID(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public Genre getGenre() { return genre; }

    public void setGenre(Genre genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "Book: " + "id = " + getID() +
                "\n\tTitle: " + getTitle() + "\n" +
                "\t" + getGenre().toString();
    }
}
