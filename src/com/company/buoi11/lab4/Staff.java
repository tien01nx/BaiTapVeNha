package com.company.buoi11.lab4;

import java.util.Scanner;

public class Staff  implements IStaff{
    private  String id,name;
    private double salary;


    public Staff(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Staff() {
    }

    public void enterStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id: ");
        id = sc.nextLine();
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("salary: ");
        salary = sc.nextDouble();
    }
    public void showStaff(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("salary: "+calculateSalary());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        if(salary>=11000000)
        return salary*0.1;
        else
            return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
