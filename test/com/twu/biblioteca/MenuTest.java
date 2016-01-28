package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {
    @Test
    public void testOneOption() throws Exception {
        UserMenu userMenu = mock(UserMenu.class);

        when(userMenu.show()).thenReturn("List Books");
    }
}
