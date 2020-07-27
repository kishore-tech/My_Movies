package sg.edu.rp.c346.id18037611.mymovies;

import java.util.Calendar;

public class Movie {
    private String title;
    private int year;
    private String rated;
    private float rating;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;

    public Movie(String title, int year, String rated, float rating, String genre, Calendar watched_on, String in_theatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.rating = rating;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
