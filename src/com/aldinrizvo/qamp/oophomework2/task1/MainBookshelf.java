package com.aldinrizvo.qamp.oophomework2.task1;

public class MainBookshelf {
    public static void main(String[] args) {
        final Book theLittlePrince = new Book("The Little Prince", 9783140,
                "Antoine de Saint-Exupéry");
        final Book robinsonCrusoe = new Book("Robinson Crusoe", 978019, "Daniel Defoe");
        final Book whiteFang = new Book("White Fang", 978000, "Jack London");

        final long testISBNSearch = 978000;
        final String testTitleSearch = "The Little Prince";

        Bookshelf bookList = new Bookshelf();

        bookList.addBook(theLittlePrince);
        bookList.addBook(robinsonCrusoe);
        bookList.addBook(whiteFang);

        System.out.println(bookList.containsBook(testISBNSearch));
        System.out.println(bookList.containsBook(testTitleSearch));
        System.out.println(bookList.containsBook(123456));

        System.out.println("\nAll books in the bookshelf: ");
        bookList.printBookshelf();
    }
}
