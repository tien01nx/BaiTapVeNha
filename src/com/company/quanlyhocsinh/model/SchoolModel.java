package com.company.quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolModel {
    School school = new School();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<School> schools = new ArrayList<>();
    // nhap du lieu school
    public void inputSchool(Scanner sc){
        System.out.println("class");
        String clas = sc.nextLine();
        school.setClas(clas);
        System.out.println("course");
        String course = sc.nextLine();
        school.setCourse(course);
        System.out.println("semester");
        String semester = sc.nextLine();
        school.setSemester(semester);
        StudentModel model = new StudentModel();
        System.out.println("nhap so luong sinh vien");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            Student student = model.inputStudent(sc);
            students.add(student);
        }
        school.setListStudents(students);
//        System.out.println(school.toString());
        schools.add(new School(clas,course,semester,students));
    }
    // hien thong tin
    public void showAllSchool(){
        System.out.println("class: "+school.getClas());
        System.out.println("course: "+school.getCourse());
        System.out.println("semester: "+school.getSemester());
        System.out.println("Students: "+school.getListStudents());
    }
    // tim kiem theo ngay sinh va dia chi
    public  void searchStudentsBirthdayAddress(){
        System.out.println("Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
        boolean check =true;
        for (int i = 0; i <students.size() ; i++) {
            if(students.get(i).getBirthday().equals("1985") && students.get(i).getAddress().equals("Thai Nguyen")){
                System.out.println(students.get(i).toString());
                check=false;
            }

        }
        if (check==true){
            System.out.println("Khong co sinh vien nao nao trong danh sach sinh nam 1985 va que o thai nguyen");
        }

    }
    // tim kiem theo lop
    public void searchClass(){
        boolean check =true;
       if (school.getClas().equals("10A1")){
           System.out.println("Hiển thị ra màn hình tất cả những học sinh sinh o lop 10A1");

           showAllSchool();
           check=false;
       }
        if (check==true){
            System.out.println("Khong co sinh vien nao nao trong danh sach sinh nam 1985 va que o thai nguyen");
        }

    }
}
