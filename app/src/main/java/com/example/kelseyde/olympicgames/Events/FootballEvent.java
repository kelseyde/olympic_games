package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Sport;

public class FootballEvent extends TeamEvent {

    public FootballEvent(String title) {
        super(title);
        this.sport = Sport.FOOTBALL;
        this.teamSize = 11;
    }

    public void prepareMedals(){}
    public void awardMedals(){}
    public void play(){}


}
