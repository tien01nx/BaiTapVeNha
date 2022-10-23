package com.company.buoi11.taikhoannganhang;

import java.util.Scanner;

public class Account implements IAccount{
//    name, accountNumber, email, accountBalance

    private String name,accountNumber,email;
    private double accountBalance;

    public Account(String name, String accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }
    @Override
    public void recharge(double amount) {
        double x = getAccountBalance() +amount;
        setAccountBalance(x);
    }

    @Override
    public void changeEmail(String email) {

        setEmail(email);
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }


}
