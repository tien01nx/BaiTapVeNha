package com.company.buoi11.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentModel {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    Student student = new Student();
    private double scoreMath, scorePhysic, scoreChemistry;
// nhap thong tin student
    public void inputStudent() {
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("score Math");
            scoreMath = sc.nextDouble();
            System.out.println("score Physic: ");
            scorePhysic = sc.nextDouble();
            System.out.println("score Chemistry: ");
            scoreChemistry = sc.nextDouble();
            double avg = scoreAverage();
            String classifi = Classification();
            students.add(new Student(name, scoreMath, scorePhysic, scoreChemistry, avg, classifi));
        }
        System.out.println(students.toString());
    }
//tinh diem trung binh
    public double scoreAverage() {
        return (scoreMath + scoreChemistry + scorePhysic) / 3;
    }
// tinh tien xep loai
    public String Classification() {
        if (scoreAverage() >= 8)
            return "xep loai A";
        else if (scoreAverage() >= 6.5 && scoreAverage() < 8)
            return "xep loai B";
        else
            return "xep loai C";
    }
// hien thong tin sinh vien
    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("name: " + students.get(i).getName());
            System.out.println("diem trung binh: " + students.get(i).getAvg());
            System.out.println("xep loai: " + students.get(i).getClassiFication());
        }
    }
    // tinh phan tram tunng loai

    public void percentRating() {
        int loaiA = 0;
        int loaiB = 0;
        int loaiC = 0;
        int i;
        for ( i = 0; i < students.size(); i++) {
            if (students.get(i).getClassiFication().equals("xep loai A")) {
                loaiA++;
            } else if (students.get(i).getClassiFication().equals("xep loai B")) {
                loaiB++;

            } else loaiC++;
        }
        System.out.println(i);
        System.out.println("% hoc sinh xep loai A la: "+(double)loaiA/i);
        System.out.println("% hoc sinh xeo loai B la: "+(double)loaiB/i);
        System.out.println("% hoc sinh xeo loai C la: "+(double)loaiC/i);





    }
}
