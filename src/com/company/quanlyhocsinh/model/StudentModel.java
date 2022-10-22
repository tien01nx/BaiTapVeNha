package com.company.quanlyhocsinh.model;

import java.util.Scanner;

public class StudentModel {
    public Student inputStudent(Scanner sc){
        sc.nextLine();
        System.out.println("name");
        String name = sc.nextLine();
        System.out.println("birthday");
        String birthday = sc.nextLine();
        System.out.println("address");
        String address= sc.nextLine();
        return new Student(name,birthday,address);
    }
}
