package org.example.varkeyword;

import java.util.ArrayList;
import java.util.List;

public class VarKeywordDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("0101DHFG", "Joshua Bloch", "Effective Java"));

        var books1 = new ArrayList<Book>();
        books1.add(new Book("0101DHFG", "Joshua Bloch", "Effective Java"));

        var name = "Vikas Rajput";
        var count = 10;

        System.out.println("Books: "+books);
        System.out.println("Books with var: "+books1);
        System.out.println("Name with var: "+name);
        System.out.println("Counter: "+count);
    }
}


