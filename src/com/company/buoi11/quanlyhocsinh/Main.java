package com.company.buoi11.quanlyhocsinh;

public class Main {
    public static void main(String[] args) {
        IClassification student  = new Student("hihi",20,9);
        student.display();
        student.classify();
    }
}
