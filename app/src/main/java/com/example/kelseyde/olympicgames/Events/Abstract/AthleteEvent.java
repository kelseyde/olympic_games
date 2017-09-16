package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.*;

public abstract class AthleteEvent extends Event {

    private int numberOfAthletes;

    public AthleteEvent(String title) {
        super(title);
    }

    public int getNumberOfAthletes() {
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(int numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }

    public void addAthlete(Athlete athlete) {
        boolean sportMatch = (getSport().equals(athlete.getSport()));
        if (sportMatch) {
            getCompetitors().add(athlete);
        }
    }

    public boolean isCorrectNumberOfAthletes() {
        boolean athleteNumberMatch = (getCompetitors().size() == numberOfAthletes);
        return athleteNumberMatch;
    }

}
