package com.company;

import java.util.Scanner;

public class Movie extends Film {
    protected int thoiluong;

    public Movie(String id, String tieude, double xephang) {
        super(id, tieude, xephang);
    }

    public void getFilm() {
        Scanner sc = new Scanner(System.in);
        int size,n;
        System.out.println("Nhập số lượng Movie: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            System.out.println("Nhap id: ");
            array[i] = Integer.parseInt(getId());
            System.out.println("Nhap tieu de: ");
            array[i] = Integer.parseInt(getTieude());
            System.out.println("chon the loai 1: kinh di, 2 hai huoc, 3 tai lieu ");
            n = sc.nextInt();
//            switch (n) {
//                case 1 -> System.out.println("the loai: " +   array[i] = Integer.parseInt(getId()););
//                case 2 -> System.out.println("The loai: " + theloai.haihuoc);
//                case 3 -> System.out.println("The loai: " + theloai.tailieu);
//
//            }

            array[i] = Integer.parseInt(getId());

        }

        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + " : " + array[i]);
        }


    }
}
