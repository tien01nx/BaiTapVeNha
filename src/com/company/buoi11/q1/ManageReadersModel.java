package com.company.buoi11.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageReadersModel {
    ArrayList<ManageReaders> readers;
    Scanner sc = new Scanner(System.in);

    public ManageReadersModel() {
        readers = new ArrayList<>();
    }

    public void addReader() {
        ManageReaders reader = new ManageReaders();
        reader.enterReader();
        readers.add(reader);
    }

    public void showReaders() {
        for (ManageReaders m : readers) {
            m.showReader();

        }
    }

    public void deleteBook() {
        System.out.println("nhap id book can xoa: ");
        sc.nextLine();
        String id = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getId().equals(id)) {
                readers.remove(i);
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
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getId().equals(id)) {
                System.out.println("Nhap lua chon ban muon thay doi");
                int n = sc.nextInt();
                System.out.println("1. name");
                System.out.println("2. phone number");
                System.out.println("3. address");
                switch (n) {
                    case 1:
                        System.out.print("nhap name muon thay doi: ");
                        String name = sc.nextLine();
                        readers.get(i).setId(name);
                        break;
                    case 2:
                        System.out.print("nhap phone number muon thay doi: ");
                        String phonenumber = sc.nextLine();
                        readers.get(i).setPhoneNumber(phonenumber);
                        break;
                    case 3:
                        System.out.print("nhap address muon thay doi: ");
                        String address = sc.nextLine();
                        readers.get(i).setAddress(address);
                        break;
                    default:
                        System.out.println("vui long ban nhap dung ");
                }


            }
        }

    }
    public void searchRead(){
        System.out.println("nhap name nguoi dung can tim kiem:");
        String name = sc.nextLine();
        boolean check= true;
        for (ManageReaders m : readers) {
           if(m.getName().contains(name)){
               System.out.println("Tim kiem thanh cong");
               m.showReader();
               check=false;
           }
        }
        if (check==true){
            System.out.println("name ko co trong danh sach");
        }
    }

}
