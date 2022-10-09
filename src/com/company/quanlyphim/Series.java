package com.company.quanlyphim;

import java.util.Scanner;

public class Series extends Film {
    private  int soTap;
    private int thoiLuongTrungBinh;

    public Series(String id, String tieude, Type type, double xephang, int soTap) {
        super(id, tieude, type, xephang);
        this.soTap = soTap;
    }

    public Series() {

    }
    Scanner sc = new Scanner(System.in);

    public void getSeries(){
        super.getInfo();
        System.out.println("so tap: ");
        soTap = sc.nextInt();
        System.out.println("thoi luong trung binh: ");
        thoiLuongTrungBinh = sc.nextInt();
    }
    public void showSeries(){
        super.showinfo();
        System.out.println("so tap: "+soTap);
        System.out.println("thoi luong trung binh: "+thoiLuongTrungBinh);
    }
}
