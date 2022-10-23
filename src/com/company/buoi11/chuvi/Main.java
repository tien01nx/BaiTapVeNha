package com.company.buoi11.chuvi;

public class Main {
    public static void main(String[] args) {
        IPolygon rectangle = new Rectangle(3,5);
        IPolygon square = new Square(3);
        rectangle.display();
        rectangle.calArea();


        square.display();
        square.calArea();
    }
}
