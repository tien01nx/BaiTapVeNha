package com.company.quanlyphim;

import java.util.Scanner;

public class Movie extends Film {


    private int thoiLuong;

    public Movie() {
    }

    public Movie(String id, String tieude, Type type, double xephang, int thoiluong) {
        super(id, tieude, type, xephang);
        this.thoiLuong = thoiluong;
    }


    Scanner  sc = new Scanner(System.in);
    public void getMovie() {
        super.getInfo();
        System.out.println("Thoi luong: ");
        thoiLuong = sc.nextInt();

    }
    public void showMovie(){
        super.showinfo();
        System.out.println("Thoi luong: "+thoiLuong);
    }

    @Override
    public String toString() {
        return "Movie{" +super.toString() +
                "thoiLuong=" + thoiLuong +
                '}';
    }
}
