package com.aldinrizvo.qamp.oophomework2.task1;

public class Book {
    private final String title;
    private final long ISBN;
    private final String author;

    public Book(final String title, final long ISBN, final String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public long getISBN() {
        return  this.ISBN;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author + " (" + this.ISBN + ")";
    }
}
