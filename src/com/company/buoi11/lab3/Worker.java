package com.company.buoi11.lab3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Worker {
//    id, name, age, salary, workPlace

    private String id, name, age;
    private double salary;
    private  String status ="Up";
    private LocalDate date;


    public Worker() {

    }

    public Worker(String id, String name, String age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker(String id, String name, String age, double salary, String status, LocalDate date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public void enterWorker() {
        System.out.println("----------- Add worker -----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        id = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        LocalDate localDate = LocalDate.now();
        this.setDate(localDate);

    }

    public void showWorker() {
        System.out.printf("\n%-10s %-15s %-10s %-25s %-10s %-10s\n", this.id, this.name, this.age, this.salary,this.status,this.date);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
