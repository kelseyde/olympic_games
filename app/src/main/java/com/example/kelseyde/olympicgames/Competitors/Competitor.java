package com.example.kelseyde.olympicgames.Competitors;
import com.example.kelseyde.olympicgames.*;
import com.example.kelseyde.olympicgames.Medals.Medal;

import java.util.ArrayList;

public abstract class Competitor implements Competable {

    private String name;
    private Nationality nationality;
    private Sport sport;
    private ArrayList<Medal> medalArray;
    private NumberGenerating resultGenerator;

    public Competitor(String name, Nationality nationality, Sport sport) {
        this.name = name;
        this.nationality = nationality;
        this.sport = sport;
        this.medalArray = new ArrayList<>();
        this.resultGenerator = new ResultGenerator();
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public ArrayList<Medal> getMedalArray() {
        return medalArray;
    }

    public void setMedalArray(ArrayList<Medal> medalArray) {
        this.medalArray = medalArray;
    }

    public NumberGenerating getResultGenerator() {
        return resultGenerator;
    }

    public void setResultGenerator(NumberGenerating resultGenerator) {
        this.resultGenerator = resultGenerator;
    }

    //methods

}
