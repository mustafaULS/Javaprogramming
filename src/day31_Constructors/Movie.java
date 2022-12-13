package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String  country , title , Genre ,releaseDate , director;

    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}
