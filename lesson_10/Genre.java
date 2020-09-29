package lesson_10;

import java.util.*;

public class Genre {
    private static List<Genre> genres = new ArrayList<>();
    private String name;
    private int id;
    private static int countID;

    public Genre(String name) {
        for(Genre genre: genres) {
            if (genre.getName().equals(name.toLowerCase())) {
                this.id = genre.getID();
                this.name = genre.getName();
                return;
            }
        }
        this.id = ++countID;
        this.name = name.toLowerCase();
        addGenre(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    private static void addGenre(Genre genre) {
        ListIterator<Genre> iterator = genres.listIterator();

        if(genres.size() == 0) {
            genres.add(genre);
        } else {
            while(iterator.hasNext()) {
                Genre anotherGenre = iterator.next();

                if(anotherGenre.getName().equals(genre.getName())) {
                    System.out.println("This genre is already exist.");
                    return;
                }
            }
        }
        genres.add(genre);
    }

    @Override
    public String toString() {
        return "Genre: " + getName() + "; " +
                "id = " + getID();
    }

}
