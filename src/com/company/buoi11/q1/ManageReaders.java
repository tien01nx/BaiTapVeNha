package com.company.buoi11.q1;

import java.util.Scanner;

public class ManageReaders {
//    : Id, name, số điện thoại, địa chỉ.
    private  String id,name,phoneNumber,address;

    public ManageReaders() {
    }

    public ManageReaders(String id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        phoneNumber = phoneNumber;
        this.address = address;
    }

    public  void enterReader(){
        Scanner sc = new Scanner(System.in);

        System.out.print("id: ");
        id = sc.nextLine();
        System.out.print("name: ");
        name = sc.nextLine();
        System.out.print("phoneNumber: ");
        phoneNumber = sc.nextLine();
        System.out.print("address: ");
        address = sc.nextLine();
    }
    public  void showReader(){
        System.out.println("____________");
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("phone number" +phoneNumber);
        System.out.println("address: "+address);

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ManageReaders{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
