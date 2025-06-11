package org.example;

public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book: "  + getTitle()
                + " by "   + getCreator()
                + " ("     + getYear() + ")"
                + " - "    + pages + " pages";
    }
}
