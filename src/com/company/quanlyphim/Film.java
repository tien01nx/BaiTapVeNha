package com.company.quanlyphim;

import java.util.Scanner;

public class Film {
    int n;
    protected String id;
    protected String tieuDe;
    protected Type type;
    protected double xepHang;

    public Film() {
    }

    public Film(String id, String tieude, Type type, double xephang) {
        this.id = id;
        this.tieuDe = tieude;
        this.type = type;
        this.xepHang = xephang;
    }
    public String hihi(){
        if(n==1)
            return "kinh di";
        if (n==2)
            return  "hai huoc";
        return "tai lieu";
    }
    @Override
    public String toString() {
        return

                ", id='" + id + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", the loai'=" +hihi()

                +
                ", xepHang=" + xepHang ;
    }

    public Film(String id, String tieude, double xephang) {
        this.id = id;
        this.tieuDe = tieude;
        this.xepHang = xephang;
    }

    public void getInfo() {

        Scanner sc = new Scanner(System.in);


        System.out.println("id: ");
        id = sc.nextLine();
        System.out.println("tieu de: ");
        tieuDe = sc.nextLine();
        System.out.println("chon the loai 1: kinh di, 2 hai huoc, 3 tai lieu ");
        n = sc.nextInt();
        switch (n) {

            case 1 -> {
                System.out.println("the loai :" + Type.kinhdi);
            }
            case 2 -> {
                System.out.println("the loai :" + Type.haihuoc);
            }
            case 3 -> {
                System.out.println("the loai :" + Type.tailieu);
            }
        }
        System.out.println("Xep hang: ");
        xepHang = sc.nextDouble();

    }

    public void showinfo() {
        System.out.println("Id: " + id);
        System.out.println("Tieu de: " + tieuDe);
        if (n == 1) {
            System.out.println("The loai:" + Type.kinhdi);
        } else if (n == 2) {
            System.out.println("The loai:" + Type.haihuoc);
        }
        else {
            System.out.println("The loai:" + Type.tailieu);
        }
        System.out.println("xep hang "+xepHang);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieude() {
        return tieuDe;
    }

    public void setTieude(String tieude) {
        this.tieuDe = tieude;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getXephang() {
        return xepHang;
    }

    public void setXephang(double xephang) {
        this.xepHang = xephang;
    }
}
