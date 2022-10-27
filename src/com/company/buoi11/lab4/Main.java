package com.company.buoi11.lab4;

import com.company.buoi11.lab3.ListWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffModel model = new StaffModel();
        do {
            System.out.println("========== Worker Management==========");
            System.out.println("1. nhap xuat danh sach nhan vien");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information");
            System.out.println("5. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    model.addList();

                    break;
                case 2:
                    model.showList();
                    break;
                case 3:
//                    model.updateSalary();
                    break;
//                case 4:
//                    model.downSalary();

            }
        } while (true);

    }
}

