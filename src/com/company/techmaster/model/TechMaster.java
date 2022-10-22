package com.company.techmaster.model;

import java.util.ArrayList;
import java.util.Objects;

public class TechMaster {
    private String quanLy;
    private String giangVien;
    private LopHoc lopHoc;

    public TechMaster() {
    }

    public TechMaster(String quanLy, String giangVien, LopHoc lopHoc) {
        this.quanLy = quanLy;
        this.giangVien = giangVien;
        this.lopHoc = lopHoc;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public String getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(String quanLy) {
        this.quanLy = quanLy;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "quanLy='" + quanLy + '\'' +
                ", giangVien='" + giangVien + '\'' +
                ", lopHoc=" + lopHoc +
                '}';
    }
}
