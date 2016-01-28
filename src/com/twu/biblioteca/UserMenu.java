package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UserMenu {
    private static List options = Arrays.asList("List Books");

    public String show() {
        String buffer = "";
        for (Iterator i = options.iterator(); i.hasNext();){
            buffer += (String)i.next() + "\n";
        }
        System.out.println(buffer);
        return buffer;
    }
}
