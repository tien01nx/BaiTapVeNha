package com.company.buoi11.chuvi;

public class Square implements IPolygon{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void calArea() {
        System.out.println("dien tich hinh vuong "+side*side);
    }
}
