package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Medals.AthleteMedal;
import java.util.ArrayList;
import static com.example.kelseyde.olympicgames.Medals.MedalType.*;

public abstract class AthleteEvent extends Event {

    private int numberOfAthletes;

    public AthleteEvent(String title) {
        super(title);
    }

    public int getNumberOfAthletes() {
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(int numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }

    public void addAthlete(Athlete athlete) {
        boolean sportMatch = (getSport().equals(athlete.getSport()));
        if (sportMatch) {
            getCompetitors().add(athlete);
        }
    }

    public boolean isCorrectNumberOfAthletes() {
        boolean athleteNumberMatch = (getCompetitors().size() == numberOfAthletes);
        return athleteNumberMatch;
    }

    public void awardMedals(ArrayList<Competitor> medalWinners){
        ArrayList<Athlete> medalWinnersDowncast = downcastCompetitorsIntoAthletes(medalWinners);
        medalWinnersDowncast.get(0).getMedalArray().add(new AthleteMedal(GOLD));
        medalWinnersDowncast.get(1).getMedalArray().add(new AthleteMedal(SILVER));
        medalWinnersDowncast.get(2).getMedalArray().add(new AthleteMedal(BRONZE));
    }

    public ArrayList<Athlete> downcastCompetitorsIntoAthletes(ArrayList<Competitor> competitors) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        for (Competitor competitor : competitors) {
            Athlete athlete = (Athlete) competitor;
            athletes.add(athlete);
        }
        return athletes;
    }

}
