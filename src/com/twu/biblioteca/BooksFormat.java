package com.twu.biblioteca;

public class BooksFormat {
    public static String format(String name, String author, String data) {
        return String.format("<<%s>>\t%s\t%s", name, author, data);
    }
}
