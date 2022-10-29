package com.company.managelibrary.model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String subject;
    private int numberOfBook;


    public Book() {
    }

    public Book(int id, String name, String author, String subject, int numberOfBook) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.numberOfBook = numberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", numberOfBook=" + numberOfBook +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
}
