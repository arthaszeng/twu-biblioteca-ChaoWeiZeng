package com.twu.biblioteca;

public class Format {
    public static String format(String name, String author, String data) {
        String buffer = String.format("<<%s>>\t%s\t%s", name, author, data);
        return buffer;
    }
}
