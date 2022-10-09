package com.company;

import com.company.quanlylophoc.DanhSachUser;
import com.company.quanlylophoc.Student;
import com.company.quanlylophoc.Teacher;
import com.company.quanlylophoc.User;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

//    private static Object Teacher;

    public static void main(String[] args) {
        // write your code here
        DanhSachUser user = new DanhSachUser();
        Scanner sc = new Scanner(System.in);
        int n;
        do {

            System.out.println("\n-----------------Menu-----------------");
            System.out.println("1. hien thong tin sinh vien, giao vien ");
            System.out.println("2. tim kiem theo keyword ");
            System.out.println("3. sap xep theo ten tang dan a-z");
            System.out.println("4. sap xep tuoi giam dan");
            System.out.println("5. ket thuc chuong trinh");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {

                    user.creatList();
                    user.show();
                }

                case 2 -> user.searchName();
                case 3 -> {
                    user.sortName();
                    System.out.println("danh sach sau khi sap xep la:");
                    user.show();
                }
                case 4 -> {
                    user.sortage();
                    System.out.println("danh sach sau khi sap xep la:");
                    user.show();
                }
                case 5 -> System.exit(0);
                default -> System.out.println("ban nhap sai vui long chon lai");
            }
        } while (n != 0);
    }
}


//

//        Film film = new Film();
//        Movie movie = new Movie();
//
//        DanhSachMovieAndSeries danhSachMovie = new DanhSachMovieAndSeries();
//        Series series = new Series();
//        Scanner sc = new Scanner(System.in);
//        JavaBuoi3 jv3 = new JavaBuoi3();
//        Student student = new Student();
//        int n;
//        do {
//
//            System.out.println("\n-----------------Menu-----------------");
////            System.out.println("1. Giải phương trình bậc nhất");
////            System.out.println("2. Giải phương trình bậc 2");
////            System.out.println("3. Tính tiền điện");
////            System.out.println("4. Kết thúc");
//            System.out.println("5. nhap danh sach movie");
//            System.out.println("6. hien danh sach movie");
//            System.out.println("7. hien danh sach series");
//            System.out.println("8. hien danh sach series");
//            System.out.println("9. Tim kiem theo tieu de Movie and Series");
//            System.out.println("Nhập lựa chọn: ");
//            n = sc.nextInt();
//            switch (n) {
////                case 1 -> jv3.giaiPTB1();
////                case 2 -> jv3.giaiPTB2();
////                case 3 -> jv3.tinhTienDien();
////                case 4 -> System.exit(0);
//                case 5 -> {
//                  danhSachMovie.getListMovie();
//                    break;
//                }
//                case 6 -> {
//                    danhSachMovie.showListMovie();
//                    break;
//                }
//                case 7 -> {
//
//                    danhSachMovie.getListSeries();
//                    break;
//                }
//                case 8 -> {
//
//                    danhSachMovie.showListSeries();
//                    break;
//                }
//
////                case 10 -> {
////                    System.out.println("Nhap tieu de can tim kiem: ");
//////                    sc.nextLine();
//////                    String tieude = sc.nextLine();
//////                    danhSachMovie.timKiemTD(tieude);
////                    danhSachMovie.xepHang();
////                    break;
////                }
////                case 11 -> {
////
////                  jv3.bt2Mang();
////                }
////                case 12 -> {
////
////                   student.show();
////                    break;
////                }
//                default -> System.out.println("Bạn chọn sai vui lòng chọn lại: ");
//            }
//
//
//        } while (n != 0);


