package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testOneOption() throws Exception {

        UserMenu userMenu = new UserMenu();

//        UserMenu userMenu = mock(UserMenu.class);
//        userMenu.addOption("Buy Book");

        assertEquals("[ L ] List Books", userMenu.show());
//        when(userMenu.show()).thenReturn("[ L ] List Books");
    }
}
