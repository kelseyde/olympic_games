package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Events.Abstract.AthleteEvent;

import java.util.ArrayList;
import java.util.Collections;

public class BadmintonEvent extends AthleteEvent {

    public BadmintonEvent(String title) {
        super(title);
        setSport(Sport.BADMINTON);
        setNumberOfAthletes(8);
    }

    public ArrayList<Competitor> play() {

        //setup medalist variables and arraylist
        ArrayList<Competitor> medalWinners = new ArrayList<>();
        Competitor firstPlace = null;
        Competitor secondPlace = null;
        Competitor thirdPlace = null;

        //prepare quarter finals
        ArrayList<Competitor> q1 = new ArrayList<Competitor>();
        ArrayList<Competitor> q2 = new ArrayList<Competitor>();
        ArrayList<Competitor> q3 = new ArrayList<Competitor>();
        ArrayList<Competitor> q4 = new ArrayList<Competitor>();
        ArrayList<ArrayList> quarterFinals = new ArrayList<ArrayList>();
        Collections.addAll(q1, getCompetitors().get(0), getCompetitors().get(1));
        Collections.addAll(q2, getCompetitors().get(2), getCompetitors().get(3));
        Collections.addAll(q3, getCompetitors().get(4), getCompetitors().get(5));
        Collections.addAll(q4, getCompetitors().get(6), getCompetitors().get(7));
        quarterFinals.add(q1);
        quarterFinals.add(q2);
        quarterFinals.add(q3);
        quarterFinals.add(q4);

        //play quarter finals
        ArrayList<Competitor> semiFinalSetup = new ArrayList<>();
        for (ArrayList<Competitor> quarterFinal : quarterFinals) {
            int winningScore = 0;
            Competitor winner = null;
            for (Competitor team : quarterFinal) {
                int result = team.compete();
                if (result > winningScore) {
                    winningScore = result;
                    winner = team;
                }
            }
            semiFinalSetup.add(winner);
        }

        //prepare semi finals
        ArrayList<Competitor> s1 = new ArrayList<>();
        Collections.addAll(s1, semiFinalSetup.get(0), semiFinalSetup.get(1));
        ArrayList<Competitor> s2 = new ArrayList<>();
        Collections.addAll(s2, semiFinalSetup.get(2), semiFinalSetup.get(3));
        ArrayList<ArrayList> semiFinals = new ArrayList<>();
        semiFinals.add(s1);
        semiFinals.add(s2);

        //play semi finals
        ArrayList<Competitor> finals = new ArrayList<>();
        for (ArrayList<Competitor> semiFinal : semiFinals) {
            int winningScore = 0;
            Competitor winner = null;
            for (Competitor team : semiFinal) {
                int result = team.compete();
                if (result > winningScore) {
                    winningScore = result;
                    winner = team;
                }
            }
            finals.add(winner);
            semiFinalSetup.remove(winner);
        }

        //prepare third-place playoff
        ArrayList<Competitor> thirdPlacePlayoff = new ArrayList<>();
        for (Competitor team : semiFinalSetup) {
            thirdPlacePlayoff.add(team);
        }

        //play third-place playoff
        int winningScore = 0;
        Competitor winner = null;
        for (Competitor team : thirdPlacePlayoff) {
            int result = team.compete() ;
            if (result > winningScore) {
                winningScore = result;
                winner = team;
            }
        }
        thirdPlace = winner;

        //play final
        winningScore = 0;
        winner = null;
        for (Competitor team : finals) {
            int result = team.compete();
            if (result > winningScore) {
                winningScore = result;
                winner = team;
            }
        }
        firstPlace = winner;

        //arrange medalists
        finals.remove(winner);
        secondPlace = finals.get(0);
        medalWinners.add(firstPlace);
        medalWinners.add(secondPlace);
        medalWinners.add(thirdPlace);
        return medalWinners;
    }

    public void prepareMedals(){}
    public void awardMedals(){}


}
