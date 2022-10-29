package com.company.buoi11.q1;

import java.util.Scanner;

public class ManagementBook {
//    : Id, name, chủ đề, tác giả, số lượng còn trong thư viện
    private  String id,name,author;
    private int amount;
    public ManagementBook() {

    }
    public ManagementBook(String id, String name, String author, int amount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.amount = amount;
    }
    public void enterBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        id = sc.nextLine();
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("author: ");
        author = sc.nextLine();
        System.out.print("amount: ");
        amount = sc.nextInt();

    }
    public void  showBook(){
        System.out.println("____________");
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("author: "+author);
        System.out.println("amount: "+amount);
    }

    @Override
    public String toString() {
        return "ManagementBook{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
