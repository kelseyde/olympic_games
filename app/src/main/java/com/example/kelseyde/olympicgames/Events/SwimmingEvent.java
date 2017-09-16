package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Events.Abstract.AthleteEvent;

import java.util.ArrayList;

import static com.example.kelseyde.olympicgames.Competitors.Sport.SWIMMING;

public class SwimmingEvent extends AthleteEvent {

    public SwimmingEvent(String title) {
        super(title);
        setSport(SWIMMING);
        setNumberOfAthletes(8);
    }

    public void prepareMedals(){}

    public void awardMedals(){}

    public ArrayList<Competitor> play(){
        return new ArrayList<Competitor>();
    }

}
