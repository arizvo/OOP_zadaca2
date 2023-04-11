package com.aldinrizvo.qamp.oophomework2.task1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private final List<Book> bookList;

    public Bookshelf() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(final Book book) {
        this.bookList.add(book);
    }

    public boolean containsBook(final String title) {
        for (final Book book : this.bookList) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsBook(final long ISBN) {
        for (final Book book : this.bookList) {
            if (book.getISBN() == ISBN) {
                return true;
            }
        }

        return false;
    }

    public void printBookshelf() {
        for (final Book book : this.bookList) {
            System.out.println(book.toString());
        }
    }
}
