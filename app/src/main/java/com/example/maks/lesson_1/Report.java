package com.example.maks.lesson_1;

public class Report {
    private int authorImage;
    private int flagImage;
    private String authorName;
    private String authorPosition;
    private String authorLocation;

    public Report(int authorImage, int flagImage, String authorName, String authorPosition, String authorLocation) {
        this.authorImage = authorImage;
        this.flagImage = flagImage;
        this.authorName = authorName;
        this.authorPosition = authorPosition;
        this.authorLocation = authorLocation;
    }

    public int getAuthorImage() {
        return authorImage;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorPosition() {
        return authorPosition;
    }

    public String getAuthorLocation() {
        return authorLocation;
    }
}
