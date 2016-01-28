package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BibliotecaApp {
    public static List bookList = new ArrayList();

    public void AppInit() {
        BooksData booksData = new BooksData();
        for (Iterator i = booksData.BOOKSDATA.iterator(); i.hasNext();){
            bookList.add((String) i.next());
        }
    }

    public void showBooks() {
        for (Iterator i = bookList.iterator(); i.hasNext();){
            System.out.println("<<"+(String) i.next()+">>");
        }
    }

    public void showOneBook(Books book) {
        if (book.getName()!=null || book.getAuthor()!= null || book.getDate() != null){
            System.out.println("<<"+book.getName()+">>");
            System.out.println(book.getAuthor());
            System.out.println(book.getDate());
        }else{
            System.out.println("error! The book does not exist!");
        }
    }
}
