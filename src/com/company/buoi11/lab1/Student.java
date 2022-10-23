package com.company.buoi11.lab1;

public class Student {
    private static int idTemp = 1;
    private String name, address;
    private int id;


    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = idTemp++;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
