package com.company.buoi11.lab7;

import java.util.Scanner;

public class Employee  {
    private String name;
    private double salary;

    public Employee() {
    }
    public void enterEmpolyee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("fullname: ");
        name  = sc.nextLine();
        System.out.print("salary: ");
        salary = sc.nextDouble();
    }
    public void showEmpolyeee(){
        System.out.println("name: "+name);
//        System.out.println("salary: "+calculateSalary());
        System.out.println("salary: "+getSalary());
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public double calculateSalary() {
//        return salary;
//    }
}
