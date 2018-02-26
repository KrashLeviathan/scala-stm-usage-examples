package com.krashdev.model;

public class Book {

    @SuppressWarnings("WeakerAccess")
    public final String name;
    public final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
