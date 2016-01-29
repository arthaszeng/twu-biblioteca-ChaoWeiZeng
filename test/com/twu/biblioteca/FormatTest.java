package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FormatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testBooksFormat() throws Exception {
        String name = "Lean Thinking";
        String author = "James P. Womack";
        String date = "2003.06.01";
        String buffer = String.format("<<%s>>\t%s\t%s", name, author, date);
        System.out.println(buffer);

        assertEquals("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n", outContent.toString());
    }

    @Test
    public void testMenuFormat() throws Exception {
        UserMenu userMenu = mock(UserMenu.class);

        when(userMenu.show()).thenReturn("[ L ] List Books");
    }


}
