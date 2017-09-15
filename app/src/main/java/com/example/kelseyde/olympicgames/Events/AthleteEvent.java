package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.*;

public abstract class AthleteEvent extends Event {

    public AthleteEvent(String title) {
        super(title);
    }

    public void addAthlete(Athlete athlete) {
        boolean sportMatch = (getSport().equals(athlete.getSport()));
        if (sportMatch) {
            competitors.add(athlete);
        }
    }



}
