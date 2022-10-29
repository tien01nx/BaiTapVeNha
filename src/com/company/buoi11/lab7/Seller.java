package com.company.buoi11.lab7;

import java.util.Scanner;

public class Seller extends Employee  {
    private double revenue;

    public Seller() {
    }

    public Seller(String name, double salary, double revenue) {
        super(name, salary);
        this.revenue = revenue;
    }

    @Override
    public void enterEmpolyee() {
        Scanner sc = new Scanner(System.in);
        super.enterEmpolyee();
        System.out.print("revenue: ");
        revenue = sc.nextDouble();
    }

    @Override
    public void showEmpolyeee() {
        System.out.println("--------------");
        System.out.println("name: "+super.getName());
        System.out.println("revenue: "+revenue);
        System.out.println("salary: "+getSalary());
    }

    public double getRevenue() {
        return revenue;

    }


    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public double getSalary() {
        if(revenue>=4000)
            return super.getSalary() +0.1*revenue;
        else
            return super.getSalary() +0.05*revenue;
    }

//    @Override
//    public double calculateSalary() {
//        if(revenue>=4000)
//            return super.calculateSalary() +0.1*revenue;
//        else
//            return super.calculateSalary() +0.05*revenue;
//    }


}
