package com.company.buoi11.lab4;

import java.util.Scanner;

public class MarketingStaff extends Staff implements IStaff {
    private double sales, commissionRate;

    public MarketingStaff() {
    }

    public MarketingStaff(String id, String name, double salary, double sales, double commissionRate) {
        super(id, name, salary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public void enterStaff() {
        Scanner sc = new Scanner(System.in);
        super.enterStaff();
        System.out.println("sales: ");
        sales = sc.nextDouble();
        System.out.println("commissionRate");
        commissionRate = sc.nextDouble();
    }


    public void showStaff() {
        System.out.println("id: " + super.getId());
        System.out.println("name: " + super.getName());
        System.out.println("sales: " + sales);
        System.out.println("commissionRate: " + commissionRate);
        System.out.println("luong: " + getSalary());
    }

    @Override
    public double calculateSalary() {
        if (super.getSalary() + sales * commissionRate * 0.01 >= 11000000)
            return (super.getSalary() + sales * commissionRate * 0.01) * 0.1;
        else
            return super.getSalary() + sales * commissionRate * 0.01;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "MarketingStaff{" + super.toString() +
                "sales=" + sales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "MarketingStaff{" +"id="+super.getId() + "name="+super.getName() +"salary=" +super.getSalary()+
//                "sales=" + sales +
//                ", commissionRate=" + commissionRate +
//                '}';
//    }

}
