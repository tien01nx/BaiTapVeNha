package com.company.buoi11.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentModel {
    ArrayList<Student> students = new ArrayList<>();
    public void inputStudent(){
        int n;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("address: ");
            String address = sc.nextLine();
            Student student = new Student(name,address);
            students.add(student);
            System.out.println("ban muon nhap nua khong 1. Tiep tuc 2. thoat");
             n = sc.nextInt();

        }while (n!=2);

        System.out.println(students.toString());
    }
}
