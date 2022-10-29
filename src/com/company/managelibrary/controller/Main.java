package com.company.managelibrary.controller;

import com.company.managelibrary.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo 1 list book
        Book book = new Book(1, "sach1", "author1", "subtitle1", 4);
        Book book2 = new Book(2, "sach2", "author2", "subtitle2", 0);
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        //Tạo list reader
        Reader reader = new Reader(1, "Name1", "address1", "phone1");
        Reader reader2 = new Reader(2, "Name2", "address2", "phone2");
        List<Reader> readers = new ArrayList<>();
        readers.add(reader);
        readers.add(reader2);
        TicketBook ticketBook = new TicketBook();
        TicketBook ticketBook2 = new TicketBook();
        List<TicketBook> ticketBooks = new ArrayList<>();
        ticketBooks.add(ticketBook);
        ticketBooks.add(ticketBook2);
        System.out.println(books.toString());
        do {
            System.out.println("Nhập lựa chọn :");
            System.out.println("1. Test insert book:");
            System.out.println("2. update update book:");
            System.out.println("3. delete  book:");
            System.out.println("4. Test insert Reader:");
            System.out.println("5. update up Reader:");
            System.out.println("6. delete Reader: ");
            System.out.println("7. Test Borrow books");
            int n = scanner.nextInt();
            BookModel model = new BookModel();
            ReaderModel readerModel = new ReaderModel();
            switch (n) {
                case 1:
                    System.out.println("Đầu tiên test chức năng insert book nè ...");
                    System.out.println("Nhập id book: ");
                    int id = scanner.nextInt();
                    System.out.println("Nhập tên nhanh hộ cái:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Nhập tên tác giả đi:");
                    String auth = scanner.nextLine();
                    System.out.println("Rồi nhập tiêu đề đi:");
                    String title = scanner.nextLine();
                    System.out.println("nhập số lượng sách: ");
                    int numberOfBook1 = scanner.nextInt();

                    Book book3 = new Book(id, name, auth, title, numberOfBook1);
                    model.insert(book3, books);
                    System.out.println(books.toString());
                    break;
                case 2:
                    System.out.println("Giờ test chức năng update book nè ...");
                    System.out.println("Nhập id muốn update:");
                    int id4 = scanner.nextInt();
                    System.out.println("Nhập tên nhanh hộ cái:");
                    scanner.nextLine();
                    String name4 = scanner.nextLine();
                    System.out.println("Nhập tên tác giả đi:");
                    String auth4 = scanner.nextLine();
                    System.out.println("Rồi nhập tiêu đề đi:");
                    String title4 = scanner.nextLine();
                    System.out.println("Nhập số lượng sách:");
                    int numberOfBook = scanner.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getId() == id4) {
                            Book b = new Book(id4, name4, auth4, title4, numberOfBook);
                            model.update(i, b, books);
                        }
                    }
                    System.out.println(books.toString());
                    break;
                case 3:
                    System.out.println("Giờ test chức năng delete chứ j ...");
                    System.out.println("Nhập id muốn delete nào");
                    int idd = scanner.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getId() == idd) {
                            Book book1 = books.get(i);
                            model.delete(book1, books);
                        }
                    }

                    System.out.println(books.toString());
                    break;

                case 4:
                    System.out.println("Đầu tiên test chức năng insert Reader nè ...");
                    System.out.println("Nhập id Reader: ");
                    int idR = scanner.nextInt();
                    System.out.println("Nhập tên nhanh hộ cái:");
                    scanner.nextLine();
                    String nameR = scanner.nextLine();
                    System.out.println("Nhập tên tác giả đi:");
                    String address = scanner.nextLine();
                    System.out.println("Rồi nhập tiêu đề đi:");
                    String phone = scanner.nextLine();

                    Reader reader3 = new Reader(idR, nameR, address, phone);
                    readerModel.insert(reader3, readers);

                    System.out.println(readers.toString());
                    break;
                case 5:
                    System.out.println("Giờ test chức năng update reader nè ...");
                    System.out.println("Nhập id muốn cập nhật: ");
                    int idhihi = scanner.nextInt();
                    System.out.println("Nhập tên nhanh hộ cái:");
                    scanner.nextLine();
                    String nameR3 = scanner.nextLine();
                    System.out.println("Nhập địa chỉ đi:");
                    String address3 = scanner.nextLine();
                    System.out.println("Rồi nhập phone đi:");
                    String phone3 = scanner.nextLine();
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).getId() == idhihi) {
                            Reader reader4 = new Reader(idhihi, nameR3, address3, phone3);
                            readerModel.update(i, reader4, readers);
                        }
                    }
                    System.out.println(readers.toString());

                    break;

                case 6:
                    System.out.println("Giờ test chức năng delete chứ j ...");
                    System.out.println("Nhập id muốn delete nào");
                    int idDel = scanner.nextInt();

                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getId() == idDel) {
                            Reader reader1 = readers.get(i);
                            readerModel.delete(reader1, readers);
                        }
                    }

                    System.out.println(readers.toString());
                    break;
                case 7:
                    System.out.println("Chức năng người mượn sách:");
                    System.out.println("Sach: ");
                    System.out.println(books.toString());

                    System.out.println("Nguoi muon: ");
                    System.out.println(readers.toString());

                    System.out.println("_______________");
                    System.out.print("Người mượn sách: ");
                    scanner.nextLine();
                    String nameM = scanner.nextLine();
                    System.out.print("Sách được  mượn : ");
                    String nameBook = scanner.nextLine();
                    System.out.print("Ngày mượn: ");
                    String borrowedDate = scanner.nextLine();
                    System.out.println("Ngày hạn phải trả:");
                    String dueDate = scanner.nextLine();
                    boolean check = true;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).getName().equals(nameM)) {
                            for (int j = 0; j < books.size(); j++) {
                                if (books.get(j).getName().equals(nameBook)) {
                                    System.out.println("Người mượn sách: " + nameM);
                                    System.out.println("Sách được mượn: " + nameBook);
                                    System.out.println("Ngày mượn: " + borrowedDate);
                                    System.out.println("Ngày hạn phải trả: " + dueDate);
                                    for (Book b : books) {
                                        if (b.getName().equals(nameBook)) {
                                            int amountBook = b.getNumberOfBook() - 1;
                                            b.setNumberOfBook(amountBook);
                                            System.out.println(books.toString());
                                            check = false;
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (check) {
                        System.out.println("Sách mượn hoặc tên mượn không có trong hệ thống:");
                    }


                    break;

                default:
                    System.out.println("ban lua chon sai vui long chon lai:");

            }
        } while (true);


    }
}
