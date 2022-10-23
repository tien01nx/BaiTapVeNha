package com.company.buoi11.lienminhhuyenthoai;

public class Main {
    public static void main(String[] args) {
        ICanSurf yasuo =  new Yasuo("đen ","kiếm");
        Lucian lucian = new Lucian("nâu","súng");
//        ICanSurf lucian1 = new Lucian("nâu","kiếm");
        yasuo.surf();

        lucian.shoot();
        lucian.surf();
    }
}
