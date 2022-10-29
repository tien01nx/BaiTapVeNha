package com.company.buoi11.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SellerModel seller = new SellerModel();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========== Worker Management==========");
            System.out.println("1. Add Seller");
            System.out.println("2. Show Seller");
//            System.out.println("3. Down salary");
//            System.out.println("4. Display Information");
//            System.out.println("5. Exit");
            int n = sc.nextInt();
            switch (n){
                case  1 :
                 seller.addSeller();
                    break;
                case 2:
                    seller.showSeller();
                    break;
//                case 3:
//                    model.updateSalary();
//                    break;
//                case 4:
//                    model.downSalary();

            }
        }while (true);
    }
}
