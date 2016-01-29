package com.twu.biblioteca;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserMenu {
    public static List<String> options = Collections.singletonList("List Books");

    public String show() {
        String result = "";
        for (Iterator<String> i = options.iterator(); i.hasNext();){
            result += MenuFormat.format(i.next());
        }
        System.out.println(result);
        return result;
    }



    public void addOption(String optionName) {
        options.add(optionName);
    }

    public void selectOption(BibliotecaApp bibliotecaApp, String l) {
        bibliotecaApp.showBooks();
    }
}
