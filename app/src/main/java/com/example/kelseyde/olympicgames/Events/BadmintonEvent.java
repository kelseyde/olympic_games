package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Sport;

public class BadmintonEvent extends AthleteEvent{

    public BadmintonEvent(String title) {
        super(title);
        this.sport = Sport.BADMINTON;
    }

    public void prepareMedals(){}
    public void awardMedals(){}
    public void play(){}

}
