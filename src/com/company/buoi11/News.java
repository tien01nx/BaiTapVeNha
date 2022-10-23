package com.company.buoi11;

public class News implements INew{
    private String title;
    private String author;
    private String publicDate;
    private Double rate;

    public News(String title, String author, String publicDate, Double rate) {
        this.title = title;
        this.author = author;
        this.publicDate = publicDate;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicDate='" + publicDate + '\'' +
                ", rate=" + rate +
                '}';
    }


    @Override
    public void display() {
        System.out.println(toString());
    }


}
