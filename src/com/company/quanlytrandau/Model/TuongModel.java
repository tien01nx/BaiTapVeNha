package com.company.quanlytrandau.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class TuongModel {

    public Tuong createTuong(Scanner sc) {
        Tuong tuong = new Tuong();
        System.out.println("name: ");
        String name = sc.nextLine();
        tuong.setName(name);
        System.out.println("position: ");
        String position = sc.nextLine();
        tuong.setPosition(position);
        return new Tuong(name,position);
    }

}
