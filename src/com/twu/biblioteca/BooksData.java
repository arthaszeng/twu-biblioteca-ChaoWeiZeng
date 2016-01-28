package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public final class BooksData {
    private static final Books LEADTHINKING = new Books("Lean Thinking", "James P. Womack", "2003.06.01");
    private static final Books CLEANCODE = new Books("Clean Code", "Robert C. Martin", "2010.01.01");

    public static final List<Books> BOOKSDATA = Arrays.asList(LEADTHINKING, CLEANCODE);

}
