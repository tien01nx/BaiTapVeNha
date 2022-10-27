package com.company.buoi11.lab4;

import java.util.Scanner;

public class Manager extends Staff implements IStaff {
    private double responsibleWage;

    @Override
    public double calculateSalary() {
        if (super.getSalary() + responsibleWage >= 11000000)

            return (super.getSalary() + responsibleWage) * 0.1;
        else
            return super.getSalary() + responsibleWage;
    }

    public void enterStaff() {
        Scanner sc = new Scanner(System.in);
        super.enterStaff();
        System.out.println("responsibleWage: ");
        responsibleWage = sc.nextDouble();

    }

    public void showStaff() {
        System.out.println("id: " + super.getId());
        System.out.println("name: " + super.getName());
        System.out.println("responsibleWage: " + responsibleWage);
        System.out.println("luong: " + getSalary());

    }

    public double getResponsibleWage() {
        return responsibleWage;
    }

    public void setResponsibleWage(double responsibleWage) {
        this.responsibleWage = responsibleWage;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                "responsibleWage=" + responsibleWage +
                '}';
    }
}
