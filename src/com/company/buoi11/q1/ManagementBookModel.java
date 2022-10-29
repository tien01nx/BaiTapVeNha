package com.company.buoi11.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementBookModel {
    ArrayList<ManagementBook> books;
    Scanner sc = new Scanner(System.in);

    public ManagementBookModel() {
        books = new ArrayList<>();
    }

    public void addBook() {
        ManagementBook book = new ManagementBook();
        book.enterBook();
        books.add(book);
    }

    public void showBooks() {
        for (ManagementBook m : books) {
            m.showBook();

        }
    }

    public void deleteBook() {
        System.out.println("nhap id book can xoa: ");
        sc.nextLine();
        String id = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                books.remove(i);
                check = false;
                System.out.println("Xoa thanh cong ");
            }

        }

        if (check == false) {
            System.out.println("id khong co trong danh sach");
        }

    }

    public void updateBook() {
        System.out.println("Nhap id muon thay doi: ");
        String id = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                System.out.println("Nhap lua chon ban muon thay doi");
                int n = sc.nextInt();
                System.out.println("1. name");
                System.out.println("2. author");
                System.out.println("3. amount");
                switch (n) {
                    case 1:
                        System.out.print("nhap name muon thay doi: ");
                        String name = sc.nextLine();
                        books.get(i).setId(name);
                        break;
                    case 2:
                        System.out.print("nhap author muon thay doi: ");
                        String author = sc.nextLine();
                        books.get(i).setAuthor(author);
                        break;
                    case 3:
                        System.out.print("nhap amount muon thay doi: ");
                        int amount = sc.nextInt();
                        books.get(i).setAmount(amount);
                        break;
                    default:
                        System.out.println("vui long ban nhap dung ");
                }


            }
        }

    }
}