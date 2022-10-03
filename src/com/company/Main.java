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
                case 1:
                    jv3.giaiPTB1();
                    break;
                case 2:
                    jv3.giaiPTB2();
                    break;
                case 3:
                    jv3.tinhTienDien();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn sai vui lòng chọn lại: ");
            }


        } while (n != 0);


    }
}
