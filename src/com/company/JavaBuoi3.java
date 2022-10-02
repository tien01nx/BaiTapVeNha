package com.company;

import java.util.Scanner;

public class JavaBuoi3 {

//    Phương trình bậc 2 có dạng: a*x^2 + b*x +c = 0
    public void Quadratic(){
        System.out.println("Phương trình bậc 2 có dạng ax^2 +bx +c =0");
        double a,b,c,detal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b= sc.nextDouble();
        System.out.println("Nhập c: ");
        c =sc.nextDouble();
        if(a!=0){
            detal = b*b -4*a*c;

            if(detal>0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = "+(-b-Math.sqrt(detal))/2*a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x2 = "+(-b+Math.sqrt(detal))/2*a);
            }
           else if(detal==0)
                System.out.println("Phương trình có nghiệm duy nhất: x= "+-b/a);
            else

            System.out.println("Phương trình vô nghiệm");
        }
        else
            System.out.println("Phương trình bậc nhất có nghiệm x= "+-c/b);

    }
    public void Car(){
        System.out.println("Nhập một hãng ô tô: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch (name){
            case  "Honda":
                System.out.println("Honda City");
                System.out.println("Honda Jazz");
                System.out.println("Honda Civic");
                System.out.println("Honda Accord");
                break;
            case "BMW" :
                System.out.println("BMW 320i");
                System.out.println("BMW X7");
                System.out.println("BMW 520i");
                break;
            case "Mercedes":
                System.out.println("S 450 Luxury");
                System.out.println("GLC 300 4MATIC");
                System.out.println("AMG GT 53 4MATIC+");
                System.out.println("G 63 AMG");
                break;
            default:
                System.out.println("Vui lòng nhập các hãng xe Honda, BMW, Mercedes ");
        }
    }
//    Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
    public void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương n, tính tổng tất cả các số chẵn 0 -n ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
            if(i%2==0)
                sum = sum+i;
        System.out.println("Tổng tất cả các số chăn là: "+sum);
    }
    public void Calculator(){
        Scanner sc = new Scanner(System.in);
        String calculator;
        System.out.println("Nhập hai số a và b:");
        System.out.println("Nhập a: ");
        double a = Double.parseDouble(sc.nextLine());;
        System.out.println("Nhập b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Thực hiên phép tính + - = / * %");
        calculator =sc.nextLine();


        switch (calculator){
            case "+":
                System.out.println(a +" + "+b +" = "+a+b );
                break;
            case "-":
                System.out.println(a +" - "+b +" = "+(a-b) );
                break;
            case "*":
                System.out.println(a +"*"+b +" = "+a*b );
                break;
            case "/":
                System.out.println(a +"/"+b +" = "+a/b );
                break;
            case "%":
                System.out.println(a +"%"+b +" = "+a%b );
                break;

            default:
                System.out.println("hihih");
        }
    }
    public void Student(){
        String name,address;
        int age;
        String contin;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập tên sinh viên: ");
            name =sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            address =sc.nextLine();
            System.out.println("Nhập tuổi: ");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("Bạn có muốn tiếp tục không ? Y/N");
             contin = sc.nextLine();
             if(contin.equalsIgnoreCase("N"))
                 System.exit(0);
        }while (contin.equalsIgnoreCase("Y"));


    }
}
