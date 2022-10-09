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
            System.out.println("5. ket thuc chuong tring");
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


//        ArrayList<Teacher> listTea = new ArrayList<>();
//        ArrayList<Student> listStu = new ArrayList<>();
//
//        ArrayList<User> list = new ArrayList<>();
////        format dinh dang ngay thang nam
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String strDate= "20-08-2018";
//        String strDate2= "20-08-2002";
//        String strDate3= "20-08-2013";
//        String strDate4= "20-08-2017";
//
//        listTea.add(new Teacher("1","nguyen manh hung","hung@gmail.com","0989876781", LocalDate.parse(strDate,dtf),1,2018,"my sql"));
//        listTea.add(new Teacher("2","nguyen van dong","dong111@gmail.com","098985471",LocalDate.parse(strDate2,dtf),2,2012,"slq"));
//        listStu.add(new Student("3","nguyen van tien","tien111@gmail.com","0989471181",LocalDate.parse(strDate3,dtf),1,true,"java core"));
//        listStu.add(new Student("4","nguyen van manh","manh111@gmail.com","0989847781",LocalDate.parse(strDate4,dtf),1,false,"spring boot"));
//        listStu.add(new Student("5","nguyen van linh","linh111@gmail.com","0984574781",LocalDate.parse(strDate,dtf),1,true,"css"));
//        listStu.add(new Student("6","nguyen thi diu","diu111@gmail.com","0989854281",LocalDate.parse(strDate3,dtf),1,false,"html"));
//        listStu.add(new Student("7","tran quynh trang","hung111@gmail.com","098154781",LocalDate.parse(strDate3,dtf),1,true,"javascript"));
//        listStu.add(new Student("8","nguyen thi thu phuong","phuong111@gmail.com","0988954781",LocalDate.parse(strDate3,dtf),1,false,"mvc"));
//
////        dung 1 list de luu thong tin
//        list.addAll(listStu);
//        list.addAll(listTea);
//
////      hien thong tin dung override
//        for(User user :list)
//            user.printInfo();
//
////        tim kiem theo keyword
////        String keyword  ="";
////        System.out.println("nhap keyword  can tim kiem");
////        keyword = sc.nextLine();
////        int dem=0;
////        for (User user : list) {
////            if (user.getName().contains(keyword ) || user.getEmail().contains(keyword ) || user.getPhoneNumber().contains(keyword)) {
////                    user.printInfo();
////                dem++;
////            }
////        }
////        if (dem == 0) {
////            System.out.println("khong co trong he thong");
////        }
//
////        sap xep ten tang dan theo a-z
////        Collections.sort(list, new Comparator<User>() {
////            @Override
////            public int compare(User o1, User o2) {
////                return (o1.getName().compareTo(o2.getName()));
////                // Muốn đảo danh sách các bạn đối thành
////                //return (o2.hoTen.compareTo(o1.hoTen));
////            }
////        });
//
////        System.out.println("Sap xep");
////        for(User user :list)
////            user.printInfo();
////        sap xep tuoi giam dan
//        Collections.sort(list, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getBirthday().getYear() < o2.getBirthday().getYear()) {
//                    return 1;
//                } else {
//                    if (o1.getBirthday().getYear() == o2.getBirthday().getYear()) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });
//
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''");
//        for(User user :list)
//            user.printInfo();
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


