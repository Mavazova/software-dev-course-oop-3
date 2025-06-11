package org.example;

public class Movie extends LibraryItem {
    private int durationMinutes;

    public Movie(String title, String director, int year, int durationMinutes) {
        super(title, director, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayInfo() {
        System.out.println("Movie: " + getTitle()
                + " by "  + getCreator()
                + " ("    + getYear()   + ")"
                + " - "   + durationMinutes + " minutes");
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle()
                + " by "  + getCreator()
                + " ("    + getYear()   + ")"
                + " - "   + durationMinutes + " minutes";
    }
}
