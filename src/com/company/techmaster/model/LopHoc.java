package com.company.techmaster.model;

import java.util.ArrayList;

public class LopHoc {
    private  String monHoc;
     ArrayList<HocVien> list;

    public LopHoc() {
    }

    public LopHoc(String monHoc, ArrayList<HocVien> list) {
        this.monHoc = monHoc;
        this.list = list;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public ArrayList<HocVien> getList() {
        return list;
    }

    public void setList(ArrayList<HocVien> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "monHoc='" + monHoc + '\'' +
                ", list=" + list +
                '}';
    }
}
