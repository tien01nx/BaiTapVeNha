package com.company.techmaster.model;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHocModel {
    public LopHoc inputLopHoc(Scanner sc){

        System.out.println("mon hoc");
        String monHoc = sc.nextLine();

       HocVienModel model = new HocVienModel();
       ArrayList<HocVien> hocViens = new ArrayList<>();

        int n;
        System.out.println("so luong hoc vien:");
        n =sc.nextInt();
        for(int i=0;i<n;i++){
            HocVien hv = model.inputHocVien(sc);
            hocViens.add(hv);
        }


       return new LopHoc(monHoc,hocViens);
    }
}
