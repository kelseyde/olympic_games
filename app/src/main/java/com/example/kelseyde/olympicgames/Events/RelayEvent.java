package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Sport;

public class RelayEvent extends TeamEvent {

    public RelayEvent(String title) {
        super(title);
        this.sport = Sport.RELAY;
        this.teamSize = 8;
    }

    public void prepareMedals(){}
    public void awardMedals(){}
    public void play(){}

}
