package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    BibliotecaApp biliotecaApp = new BibliotecaApp();

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testWelcome() throws Exception {
        System.out.println("hello,world!");
        assertEquals("hello,world!\n", outContent.toString());
    }

    @Test
    public void testShowBooksAfterWelcome() throws Exception {
        assertEquals("<<Lean Thinking>>\n<<Clean Code>>\n", outContent.toString());
    }
}
