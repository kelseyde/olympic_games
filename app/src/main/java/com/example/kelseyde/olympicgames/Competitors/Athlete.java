package com.example.kelseyde.olympicgames.Competitors;

public class Athlete extends Competitor {

    private int skill;

    public Athlete(String name, Nationality nationality, Sport sport, int skill) {
        super(name, nationality, sport);
        this.skill = skill;
    }

    //getters and setters

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    //methods

//    public int compete() {
//        int result = getResultGenerator().generate(getSkill());
//        return result;
//    }

    public int compete() {
        return skill;
    }

}
