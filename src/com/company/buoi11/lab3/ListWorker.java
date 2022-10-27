package com.company.buoi11.lab3;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListWorker {
    ArrayList<Worker> workers;


    public ListWorker() {
        workers = new ArrayList<>();
    }

    public void addWorker() {
        Worker worker = new Worker();
        worker.enterWorker();
        workers.add(worker);
    }

    public void showWorkers() {
        System.out.println("Display information Worker:");
        System.out.printf("\n%-10s %-15s %-10s %-25s %-10s %-10s\n", "id", "name", "age", "salary" ,"status","date");
        for (Worker w : workers) {
            w.showWorker();
        }
    }

    public void updateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update Salary of Worker");
        System.out.print("Enter code: ");
        String id = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        boolean check = true;
        String status ="Down";
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId().equals(id)) {

                if(workers.get(i).getSalary()>salary){
                    workers.get(i).setSalary(salary);
                    workers.get(i).setStatus("Down");
                    System.out.println("Sau khi cap nhat");
                    System.out.printf("\n%-10s %-15s %-10s %-25s %-10s\n", "id", "name", "age", "salary", "status");
                    System.out.printf("\n%-10s %-15s %-10s %-25s %-10s\n", workers.get(i).getId(),workers.get(i).getName(),workers.get(i).getAge(),workers.get(i).getSalary(),status);
                    check = false;
                }

            }
        }
        if(check){
            System.out.println("id khong co trong danh sach");
        }

    }



}
