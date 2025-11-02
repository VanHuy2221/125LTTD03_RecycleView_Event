package com.example.recycleview_event;

public class Anime {
    private String title;
    private String description;
    private int imageResource;

    public Anime(String title, String description, int imageResource) {
        this.title = title;
        this.description = description;
        this.imageResource = imageResource;
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getImageResource() { return imageResource; }
}
