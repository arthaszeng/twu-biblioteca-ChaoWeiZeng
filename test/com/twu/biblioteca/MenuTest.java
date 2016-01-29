package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class MenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testOneOption() throws Exception {

//        UserMenu userMenu = mock(UserMenu.class);
//        userMenu.addOption("Buy Book");
//        when(userMenu.show()).thenReturn("[ L ] List Books");
        UserMenu userMenu = new UserMenu();
        assertEquals("[ L ] List Books", userMenu.show());
    }

    @Test
    public void testSelectOption() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.appInit();

        UserMenu userMenu = new UserMenu();
        userMenu.selectOption(bibliotecaApp ,"l");
        assertEquals("<<Lean Thinking>>\tJames P. Womack\t2003.06.01\n" +
                "<<Clean Code>>\tRobert C. Martin\t2010.01.01\n", outContent.toString());
    }


}

