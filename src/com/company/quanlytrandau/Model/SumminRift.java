package com.company.quanlytrandau.Model;

import java.util.ArrayList;

public class SumminRift {

    private  String time;
    private ArrayList<Team> teams ;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SumminRift{" +
                "time='" + time + '\'' +
                ", teams=" + teams +
                '}';
    }
}
