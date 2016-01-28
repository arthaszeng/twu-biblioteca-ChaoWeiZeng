package com.twu.biblioteca;

public class MenuFormat {
    public static String format(String data) {
        return String.format("[ %c ] %s", data.charAt(0), data);
    }
}
