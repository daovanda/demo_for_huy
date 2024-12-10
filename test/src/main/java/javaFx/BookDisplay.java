package javaFx;

import java.util.Date;

public class BookDisplay {
    private int bookID;
    private String title;
    private String author;
    private double rating;
    private int available;


    public BookDisplay(int bookID, String title, String author, double rating, int available) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.available = available;

    }

    public BookDisplay(int bookID, String title, String author, double averageRating, java.sql.Date borrowDate, java.sql.Date dueDate) {
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    public int getAvailable() {
        return available;
    }


}
