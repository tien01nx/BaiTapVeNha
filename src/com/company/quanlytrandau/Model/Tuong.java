package com.company.quanlytrandau.Model;

public class Tuong {
    private String name,position;

    public Tuong() {

    }

    public Tuong(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tuong{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
