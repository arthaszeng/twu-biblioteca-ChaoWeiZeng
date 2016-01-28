package com.twu.biblioteca;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserMenu {
    public static List options = Collections.singletonList("List Books");

    public String show() {
        String result = "";
        for (Iterator i = options.iterator(); i.hasNext();){
            result +=MenuFormat.format((String) i.next());
        }
        System.out.println(result);
        return result;
    }
}
