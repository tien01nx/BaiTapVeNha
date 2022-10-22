package com.company.techmaster.model;

public class HocVien {
    private String id,ten,tuoi,hocluc;

    public HocVien() {
    }

    public HocVien(String id, String ten, String tuoi, String hocluc) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.hocluc = hocluc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", hocluc='" + hocluc + '\'' +
                '}';
    }
}
