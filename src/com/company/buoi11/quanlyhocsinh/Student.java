package com.company.buoi11.quanlyhocsinh;

public class Student implements IClassification{
    private String name;
    private int age;
    private double marks;

//    name, age, marks, classification

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


//    Student student = new Student(20,7.5,"Gioi");

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }


//+ Nếu điểm >=8 loại A
//       + <8 và >6.5 loại B
//       + Còn lại là loại C

    @Override

    public void classify() {
       if(marks>=8)
           System.out.println("Loai A");
       else if(marks>6.5 && marks<8)
           System.out.println("Loai B");
       else
           System.out.println("Loai C");

    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
