package com.company.buoi11.lienminhhuyenthoai;

public class Yasuo implements  ICanSurf {
//    (String) hair, (String) weapon: sword
    private  String hair;
    private String sword;

    public Yasuo(String hair, String sword) {
        this.hair = hair;
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "Yasuo{" +
                "hair='" + hair + '\'' +
                ", sword='" + sword + '\'' +
                '}';
    }

    @Override
    public void surf() {
        System.out.println(toString());
    }
}
