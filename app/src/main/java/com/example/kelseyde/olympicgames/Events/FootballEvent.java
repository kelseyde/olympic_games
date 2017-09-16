package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Athlete;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Competitors.Team;
import com.example.kelseyde.olympicgames.Events.Abstract.Knockout;
import com.example.kelseyde.olympicgames.Events.Abstract.Playable;
import com.example.kelseyde.olympicgames.Events.Abstract.TeamEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import static com.example.kelseyde.olympicgames.Competitors.Nationality.UK;
import static com.example.kelseyde.olympicgames.Competitors.Sport.FOOTBALL;

public class FootballEvent extends TeamEvent implements Knockout {

    public FootballEvent(String title) {
        super(title);
        setSport(FOOTBALL);
        setTeamSize(11);
        setNumberOfTeams(8);
    }

    public ArrayList<Competitor> play() {

        ArrayList<Competitor> medalWinners = new ArrayList<>();
        Competitor firstPlace = null;
        Competitor secondPlace = null;
        Competitor thirdPlace = null;

        //prepare quarter finals
        ArrayList<Competitor> q1 = new ArrayList<Competitor>(getCompetitors().subList(0, 2));
        ArrayList<Competitor> q2 = new ArrayList<Competitor>(getCompetitors().subList(2, 4));
        ArrayList<Competitor> q3 = new ArrayList<Competitor>(getCompetitors().subList(4, 6));
        ArrayList<Competitor> q4 = new ArrayList<Competitor>(getCompetitors().subList(6, 8));
        ArrayList<ArrayList> quarterFinals = new ArrayList<ArrayList>();
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
                semiFinalSetup.add(winner);
            }
        }

        //prepare semi finals
        ArrayList<Competitor> s1 = new ArrayList<Competitor>(semiFinalSetup.subList(0, 2));
        ArrayList<Competitor> s2 = new ArrayList<Competitor>(semiFinalSetup.subList(2, 4));
        ArrayList<ArrayList> semiFinals = new ArrayList<ArrayList>();
        semiFinals.add(s1);
        semiFinals.add(s2);

        //play semi finals
        ArrayList<Competitor> finals = new ArrayList<>();
        ArrayList<Competitor> thirdPlacePlayoff = new ArrayList<>();
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
            semiFinal.remove(winner);
            thirdPlacePlayoff.add(semiFinal.get(0));
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

    public ArrayList<ArrayList> prepareQuarterFinal() {
        ArrayList<Competitor> q1 = new ArrayList<Competitor>(getCompetitors().subList(0, 2));
        ArrayList<Competitor> q2 = new ArrayList<Competitor>(getCompetitors().subList(2, 4));
        ArrayList<Competitor> q3 = new ArrayList<Competitor>(getCompetitors().subList(4, 6));
        ArrayList<Competitor> q4 = new ArrayList<Competitor>(getCompetitors().subList(6, 8));
        ArrayList<ArrayList> quarterFinalSetup = new ArrayList<ArrayList>();
        quarterFinalSetup.add(q1);
        quarterFinalSetup.add(q2);
        quarterFinalSetup.add(q3);
        quarterFinalSetup.add(q4);
        return quarterFinalSetup;
    }

    public ArrayList<Competitor> playQuarterFinal(ArrayList<ArrayList> quarterFinalSetup) {
        ArrayList<Competitor> semiFinalSetup = new ArrayList<>();
        for (ArrayList<Competitor> quarterFinal : quarterFinalSetup) {
            int winningScore = 0;
            Competitor winner = null;
            for (Competitor team : quarterFinal) {
                int result = team.compete();
                if (result > winningScore) {
                    winningScore = result;
                    winner = team;
                }
                semiFinalSetup.add(winner);
            }
        }
        return semiFinalSetup;
    }

    public ArrayList<ArrayList> prepareSemiFinal(ArrayList<Competitor> semiFinalSetup) {
        ArrayList<Competitor> s1 = new ArrayList<Competitor>(getCompetitors().subList(0, 2));
        ArrayList<Competitor> s2 = new ArrayList<Competitor>(getCompetitors().subList(2, 4));
        ArrayList<ArrayList> semiFinals = new ArrayList<ArrayList>();
        semiFinals.add(s1);
        semiFinals.add(s2);
        return semiFinals;
    }

    public ArrayList<Competitor> playSemiFinal(ArrayList<ArrayList> semiFinalSetup) {
        ArrayList<Competitor> finalSetup = new ArrayList<>();
        ArrayList<Competitor> thirdPlaceSetup = new ArrayList<>();
        for (ArrayList<Competitor> semiFinal : semiFinalSetup) {
            int winningScore = 0;
            Competitor winner = null;
            for (Competitor team : semiFinal) {
                int result = team.compete();
                if (result > winningScore) {
                    winningScore = result;
                    winner = team;
                }
            }
        }
        return finalSetup;
    }


    public Competitor playFinal(ArrayList<Competitor> finalSetup) {
        int winningScore = 0;
        Competitor winner = null;
        for (Competitor competitor : finalSetup) {
            int result = competitor.compete();
            if (result > winningScore) {
                winningScore = result;
                winner = competitor;
            }

        }
        return winner;
    }

    public void prepareMedals(){}
    public void awardMedals(){}


}
