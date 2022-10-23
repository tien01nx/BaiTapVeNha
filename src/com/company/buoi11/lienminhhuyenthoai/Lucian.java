package com.company.buoi11.lienminhhuyenthoai;

public class Lucian implements ICanSurf,ICanShoot {
    private  String hair;
    private String sword;

    @Override
    public void shoot() {
        System.out.println(toString());
    }

    @Override
    public void surf() {
        System.out.println(toString());
    }

    public Lucian(String hair, String sword) {
        this.hair = hair;
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "Lucian{" +
                "hair='" + hair + '\'' +
                ", sword='" + sword + '\'' +
                '}';
    }
}
