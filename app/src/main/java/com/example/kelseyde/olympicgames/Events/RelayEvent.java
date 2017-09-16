package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Events.Abstract.TeamEvent;

import java.util.ArrayList;

import static com.example.kelseyde.olympicgames.Competitors.Sport.RELAY;

public class RelayEvent extends TeamEvent {

    public RelayEvent(String title) {
        super(title);
        setSport(RELAY);
        setTeamSize(4);
        setNumberOfTeams(8);
    }

    public void prepareMedals(){}
    public void awardMedals(){}
    public ArrayList<Competitor> play(){
        return new ArrayList<Competitor>();
    }

}
