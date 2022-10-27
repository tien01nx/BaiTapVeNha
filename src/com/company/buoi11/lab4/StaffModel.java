package com.company.buoi11.lab4;

import com.company.quanlylophoc.User;
import com.company.quanlynhanvien.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StaffModel {
    ArrayList<Staff> staffs;
    Scanner sc = new Scanner(System.in);

    public StaffModel() {
        staffs = new ArrayList<>();
    }

    public void addList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.staff 2. Marketing staff 3. Manager");
        int n = sc.nextInt();
        if (n == 1) {
            Staff staff = new Staff();
            staff.enterStaff();
            staffs.add(staff);
        } else if (n == 2) {
            MarketingStaff marketingStaff = new MarketingStaff();
            marketingStaff.enterStaff();
            staffs.add(marketingStaff);
        } else {
            Manager manager = new Manager();
            manager.enterStaff();
            staffs.add(manager);
        }

    }

    public void showList() {
        System.out.println(staffs);
    }

    public void deleteStaff() {
        System.out.print("nhap id staff can xoa: ");
        String id = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getId().equals(id)) {
                staffs.remove(i);
                check = false;
                System.out.println("Da xoa thanh cong");
            }
        }
        if (check) {
            System.out.println("id khong co trong danh sach");
        }
    }

    public void updateStaff() {

        System.out.print("nhap id staff update: ");
        String id = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getId().equals(id)) {
                System.out.print("nhap name muon thay doi: ");
                String name = sc.nextLine();
                staffs.get(i).setName(name);
                System.out.print("nhap luong muon thay doi: ");
                double salary = sc.nextDouble();
                staffs.get(i).setSalary(salary);
                check = false;
                System.out.println("Cap nhat thanh cong");
            }

        }
        if (check) {
            System.out.println("id khong co trong danh sach");
        }
    }

    public void searchSalary() {
        System.out.println("Tìm kiếm nhân viên theo lương");
        double salary = sc.nextDouble();
        boolean check = true;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getSalary() == salary) {
                System.out.println(staffs.get(i).toString());
                check = false;
            }
        }
        if (check) {
            System.out.println("khong tim thay trong danh sach");
        }
    }

    public void sortName() {
        System.out.println("Sắp xếp nhân viên theo họ tên và thu nhập");
//        sap xep ten tang dan theo a-z
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return (o1.getName().compareTo(o2.getName()));

            }

        });
    }
    public void sortSalary(){
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else {
                    if (o1.getSalary() == o2.getSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
    public void showTop5Salary(){
        System.out.println("Xuất 5 nhân viên có thu nhập cao nhất công ty");
        ArrayList<Staff> listTop5 = new ArrayList<>();
       listTop5.addAll(staffs);
       for(int i=0;i<5;i++){
           Staff staff = listTop5.get(0);
           for (Staff s : listTop5) {
               if (staff.getSalary() < s.getSalary())
                   staff = s;
           }
           System.out.println(staff);
           listTop5.remove(staff);
       }
    }
}

