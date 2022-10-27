package com.company.buoi11.lab2;

public class Student {
    private static int idTemp = 1;
    private  int id;
    private String name;
    private  double scoreMath,scorePhysic,scoreChemistry;


    public Student() {

    }


    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;

        this.id =idTemp++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        Student.idTemp = idTemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
}
