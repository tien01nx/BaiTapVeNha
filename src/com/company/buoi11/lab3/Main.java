package com.company.buoi11.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListWorker model = new ListWorker();
        do {
            System.out.println("========== Worker Management==========");
            System.out.println("1. Add worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information");
            System.out.println("5. Exit");
            int n = sc.nextInt();
            switch (n){
                case  1 :
                    model.addWorker();
                    break;
                case 2:
                    model.showWorkers();
                    break;
                case 3:
                    model.updateSalary();
                    break;
//                case 4:
//                    model.downSalary();

            }
        }while (true);
    }
}
