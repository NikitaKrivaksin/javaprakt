package ru.mirea.lab4_9;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
