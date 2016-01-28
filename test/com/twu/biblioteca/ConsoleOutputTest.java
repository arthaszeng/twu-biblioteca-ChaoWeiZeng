package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        BibliotecaApp biliotecaApp = mock(BibliotecaApp.class);
        biliotecaApp.AppInit();

        when(biliotecaApp.showBooks()).thenReturn("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n" +
                "<<Clean Code>>\tRobert C. Martin\t2010.01.01\n");
    }

    @Test
    public void testShowBookDetails() throws Exception {
        BibliotecaApp biliotecaApp = mock(BibliotecaApp.class);
        Books leanThinking = new Books("Lean Thinking", "James P. Womack", "2003.06.01");

        when(biliotecaApp.showOneBook(leanThinking)).thenReturn("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n");
 }

}
