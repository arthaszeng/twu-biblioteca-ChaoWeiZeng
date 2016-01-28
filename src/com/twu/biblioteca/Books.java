package com.twu.biblioteca;

public class Books {
    private String name;
    private String author;
    private String date;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public Books(String name, String author, String date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }
}
