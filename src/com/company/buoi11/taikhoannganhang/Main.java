package com.company.buoi11.taikhoannganhang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IAccount account = new Account("hihi","10987654","tienhihi@gmail.com",4000);
        Scanner sc = new Scanner(System.in);
        account.displayInfo();
        System.out.println("Nhap so tien muon nap");
        double napTien = sc.nextDouble();;
        account.recharge(napTien);
        System.out.println("Nhap email muon thay doi");
        sc.nextLine();
        String Email = sc.nextLine();
        account.changeEmail(Email);
        account.displayInfo();
    }
}
