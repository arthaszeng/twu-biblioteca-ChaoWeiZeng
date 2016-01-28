package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BibliotecaApp {
    public static List bookList = new ArrayList();

    public void AppInit() {
        BooksData booksData = new BooksData();
        for (Iterator i = booksData.BOOKSDATA.iterator(); i.hasNext();){
            bookList.add((Books) i.next());
        }
    }

    public void showBooks() {
        for (Iterator i = bookList.iterator(); i.hasNext();){
            showOneBook((Books) i.next());
        }
    }

    public void showOneBook(Books book) {
        if (book.getName()!=null || book.getAuthor()!= null || book.getDate() != null){
            System.out.print("<<" + book.getName() + ">>" + "\t");
            System.out.print(book.getAuthor() + "\t");
            System.out.println(book.getDate());
        }else{
            System.out.println("error! The book does not exist!");
        }
    }
}
