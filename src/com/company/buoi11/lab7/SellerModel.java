package com.company.buoi11.lab7;

import com.company.buoi11.lab3.Worker;

import java.util.ArrayList;

public class SellerModel {
    ArrayList<Seller> sellers;

    public SellerModel() {
        sellers = new ArrayList<>();
    }
    public void addSeller() {
        Seller seller = new Seller();
        seller.enterEmpolyee();
        sellers.add(seller);
    }
    public void showSeller() {

        for (Seller seller : sellers) {
            seller.showEmpolyeee();
        }
    }

}
