package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        JavaBuoi3 jv3 = new JavaBuoi3();
        int n;
        do {

            System.out.println("-----------------Menu-----------------");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("Nhập lựa chọn: ");
            n = sc.nextInt();
            switch (n) {
                case 1 -> jv3.giaiPTB1();
                case 2 -> jv3.giaiPTB2();
                case 3 -> jv3.tinhTienDien();
                case 4 -> System.exit(0);
                case 5 -> {
                    Film film = new Film();
//                    film.getInfo();
                }
                default -> System.out.println("Bạn chọn sai vui lòng chọn lại: ");
            }


        } while (n != 0);


    }
}
