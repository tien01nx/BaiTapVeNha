package com.company;

import java.util.Scanner;

public class Film {
    protected String id;
    protected  String tieude;

    protected enum theloai{
        kinhdi , haihuoc, tailieu;
    }
    protected  double xephang;

    public Film(){

    }
//    public void getInfo() {
//
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("id: ");
//        id = sc.nextLine();
//        System.out.println("tieu de: ");
//        tieude = sc.nextLine();
//        System.out.println("chon the loai 1: kinh di, 2 hai huoc, 3 tai lieu ");
//        n = sc.nextInt();
//        switch (n) {
//            case 1 -> System.out.println("the loai: " + theloai.kinhdi);
//            case 2 -> System.out.println("The loai: " + theloai.haihuoc);
//            case 3 -> System.out.println("The loai: " + theloai.tailieu);
//
//        }
//        System.out.println("Xep hang: ");
//        xephang =sc.nextInt();
//
//    }

    public Film(String id, String tieude, double xephang) {
        this.id = id;
        this.tieude = tieude;
        this.xephang = xephang;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public double getXephang() {
        return xephang;
    }

    public void setXephang(double xephang) {
        this.xephang = xephang;
    }
}
