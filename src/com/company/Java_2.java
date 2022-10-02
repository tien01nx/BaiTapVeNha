package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Java_2 {
    public  void String_Convert_Date(){
        Scanner sc= new Scanner(System.in);
        String date;
        System.out.println("String sang LocalDatetime");
        System.out.println("Nhập theo định dạng yyyy-MM-dd HH:mm");
        date =sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, format);
        System.out.println("Sau khi chuyển dữ liệu: "+dateTime);

    }
    public void Getdatetime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Ngày hiện tại: "+localDateTime);
        System.out.println("Thời gian của 3 ngày sau: "+localDateTime.plusDays(3));
    }
}
