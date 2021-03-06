package com.example.kelseyde.olympicgames.Competitors;

import java.util.ArrayList;

public class Team extends Competitor {

    private ArrayList<Athlete> athletes;
    private int teamSkill;

    public Team(String name, Nationality nationality, Sport sport) {
        super(name, nationality, sport);
        this.athletes = new ArrayList<>();
        this.teamSkill = getTeamSkill();
    }

    //getters and setters

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }

    public int getTeamSkill() {
        int totalSkill = 0;
        for (Athlete athlete: athletes) {
            totalSkill += athlete.getSkill();
        }
        return totalSkill;
    }

    //methods

    public void addAthlete(Athlete athlete) {
        boolean nationMatch = athlete.getNationality().equals(getNationality());
        boolean sportMatch = athlete.getSport().equals(getSport());
        if (nationMatch && sportMatch) {
            athletes.add(athlete);
        }
    }

//    public int compete() {
//        int result = getResultGenerator().generate(getTeamSkill());
//        return result;
//    }

    public int compete() {
        return getTeamSkill();
    }

}
