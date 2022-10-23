package com.company.buoi11.chuvi;

public class Rectangle implements IPolygon {
    private  double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void calArea() {
        System.out.println("dien tich hcn la"+ length*width);
    }
}
