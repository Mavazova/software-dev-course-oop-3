package org.example;

public class Album extends LibraryItem {
    private int trackCount;

    public Album(String title, String artist, int year, int trackCount) {
        super(title, artist, year);
        this.trackCount = trackCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Album: " + getTitle()
                + " by "  + getCreator()
                + " ("    + getYear()   + ")"
                + " - "   + trackCount + " tracks");
    }

    @Override
    public String toString() {
        return "Album: " + getTitle()
                + " by "  + getCreator()
                + " ("    + getYear()   + ")"
                + " - "   + trackCount + " tracks";
    }
}
