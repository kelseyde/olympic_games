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

    public void prepareMedals(){}
    public void awardMedals(){}

}
