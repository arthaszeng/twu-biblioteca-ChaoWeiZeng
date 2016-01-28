package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testWelcome() throws Exception {
        BibliotecaApp biliotecaApp = new BibliotecaApp();

        System.out.println("hello,world!");
        assertEquals("hello,world!\n", outContent.toString());
    }

    @Test
    public void testShowBooksAfterWelcome() throws Exception {
        BibliotecaApp biliotecaApp = new BibliotecaApp();
        biliotecaApp.AppInit();
        biliotecaApp.showBooks();

        assertEquals("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n" +
                "<<Clean Code>>\tRobert C. Martin\t2010.01.01\n", outContent.toString());
    }

    @Test
    public void testShowBookDetails() throws Exception {
        BibliotecaApp biliotecaApp = new BibliotecaApp();
        Books leanThinking = new Books("Lean Thinking", "James P. Womack", "2003.06.01");
        biliotecaApp.showOneBook(leanThinking);

        assertEquals("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n" ,outContent.toString());
    }

}
