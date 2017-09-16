package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Events.Abstract.AthleteEvent;

import java.util.ArrayList;

public class BadmintonEvent extends AthleteEvent {

    public BadmintonEvent(String title) {
        super(title);
        setSport(Sport.BADMINTON);
        setNumberOfAthletes(8);
    }

    public void prepareMedals(){}
    public void awardMedals(){}
    public ArrayList<Competitor> play(){
        return new ArrayList<Competitor>();
    }

}
