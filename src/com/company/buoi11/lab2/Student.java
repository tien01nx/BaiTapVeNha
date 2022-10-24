package com.company.buoi11.lab2;

public class Student {
    private static int idTemp = 1;
    private  int id;
    private String name;
    private  double scoreMath,scorePhysic,scoreChemistry,avg;
    private String classiFication;

    public Student() {

    }


    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry,double avg,String classiFication) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
        this.avg =avg;
        this.classiFication =classiFication;
        this.id =idTemp++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                ", avg=" + avg +
                ", classiFication='" + classiFication + '\'' +
                '}';
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getClassiFication() {
        return classiFication;
    }

    public void setClassiFication(String classiFication) {
        this.classiFication = classiFication;
    }
}
