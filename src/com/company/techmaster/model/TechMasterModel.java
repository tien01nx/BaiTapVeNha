package com.company.techmaster.model;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterModel {
    TechMaster techMaster = new TechMaster();
    LopHocModel model = new LopHocModel();
    HocVienModel model1 = new HocVienModel();
    public void input(Scanner sc) {


        System.out.println("nhap quan ly");
        String quanLy = sc.nextLine();
        techMaster.setQuanLy(quanLy);
        System.out.println("giang vien");
        String giangVien = sc.nextLine();
        techMaster.setGiangVien(giangVien);
        LopHoc lh = model.inputLopHoc(sc);
        techMaster.setLopHoc(lh);
        System.out.println(techMaster.toString());

    }


    public void show() {

        System.out.println("quan ly: " + techMaster.getQuanLy());
        System.out.println("giang vien: " + techMaster.getGiangVien());
        System.out.println("lop hoc: " + techMaster.getLopHoc());
    }
    public void addHocVien(Scanner sc){
        System.out.println("moi ban nhap thong tin hoc vien muon them");
        HocVien hocVien = model1.inputHocVien(sc);
        LopHoc lopHoc = techMaster.getLopHoc();
        ArrayList<HocVien> hocViens = lopHoc.getList();
        hocViens.add(hocVien);


//        HocVien hocVien = model1.inputHocVien(sc);

//        techMaster.getLopHoc().getList().add(hocVien);
        show();
    }
    public  void updateHocVien(Scanner sc){
        System.out.println("cap nhat thong tin hoc luc cua hoc vien theo id");
        System.out.println("nhap id can cap nhat");
        String id = sc.nextLine();
//        HocVien hocVien = model1.inputHocVien(sc);
        LopHoc lopHoc = techMaster.getLopHoc();
        ArrayList<HocVien> hocViens = lopHoc.getList();
        boolean kiemtra =true;
        for(HocVien hocVien1 : hocViens){
            if(hocVien1.getId().equals(id)){
                System.out.println("Nhap hoc luc muon thay doi");
                String hocLuc = sc.nextLine();
                hocVien1.setHocluc(hocLuc);
                kiemtra =false;
            }
        }
        if(kiemtra){
            System.out.println("Khong co id hoc vien trong danh sach");
        }
        else {
            System.out.println("Sau cap nhat la");
            show();
        }

    }

    public  void deleteHocVien(Scanner sc){
        System.out.println("xoa hoc vien nghi hoc khoi danh sach");
        System.out.println("nhap id can nghi hoc");
        String id = sc.nextLine();
//        HocVien hocVien = model1.inputHocVien(sc);
        LopHoc lopHoc = techMaster.getLopHoc();
        ArrayList<HocVien> hocViens = lopHoc.getList();
        boolean kiemtra =true;
        HocVien hocVien;
        for (int i = 0; i <hocViens.size() ; i++) {
            if(hocViens.get(i).getId().equals(id)){
                hocViens.remove(i);
                kiemtra=false;
            }
        }
        if(kiemtra){
            System.out.println("Khong co id hoc vien trong danh sach");
        }
        else {
            System.out.println("xoa thanh congSau cap nhat la");
            show();
        }

    }



}
