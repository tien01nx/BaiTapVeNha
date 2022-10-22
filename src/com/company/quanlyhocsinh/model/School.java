package com.company.quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private  String clas,course,semester;
    private ArrayList<Student> listStudents;

    public School(String clas, String course, String semester, ArrayList<Student> listStudents) {
        this.clas = clas;
        this.course = course;
        this.semester = semester;
        this.listStudents = listStudents;
    }

    public School() {
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    @Override
    public String toString() {
        return "School{" +
                "clas='" + clas + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                ", listStudents=" + listStudents +
                '}';
    }
}
