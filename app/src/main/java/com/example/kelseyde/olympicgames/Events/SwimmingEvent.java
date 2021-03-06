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

    public ArrayList<Competitor> play(){

        //setup medalists and scores
        ArrayList<Competitor> medalWinners = new ArrayList<>();
        int firstPlaceScore = 0;
        Competitor firstPlace = null;
        int secondPlaceScore = 0;
        Competitor secondPlace = null;
        int thirdPlaceScore = 0;
        Competitor thirdPlace = null;

        //play race
        for (Competitor athlete : getCompetitors()) {
            int result = athlete.compete();
            if (result > firstPlaceScore) {
                firstPlaceScore = result;
                firstPlace = athlete;
            } else if (result > secondPlaceScore) {
                secondPlaceScore = result;
                secondPlace = athlete;
            } else if (result > thirdPlaceScore) {
                thirdPlaceScore = result;
                thirdPlace = athlete;
            }
        }
        medalWinners.add(firstPlace);
        medalWinners.add(secondPlace);
        medalWinners.add(thirdPlace);
        return medalWinners;
    }

}
