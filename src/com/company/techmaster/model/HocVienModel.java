package com.company.techmaster.model;

import java.util.Scanner;

public class HocVienModel {

    public HocVien inputHocVien(Scanner sc){
        sc.nextLine();
        System.out.println("id");
        String id = sc.nextLine();
        System.out.println("ten");
        String ten = sc.nextLine();
        System.out.println("tuoi");
        String tuoi = sc.nextLine();
        System.out.println("hoc luc");
        String hocluc = sc.nextLine();
        HocVien hocvien = new HocVien(id,ten,tuoi,hocluc);
        return hocvien ;
    }



}
