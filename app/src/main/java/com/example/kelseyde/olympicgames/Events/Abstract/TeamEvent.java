package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Events.Abstract.Event;
import com.example.kelseyde.olympicgames.Medals.TeamMedal;

import java.util.ArrayList;

import static com.example.kelseyde.olympicgames.Medals.MedalType.BRONZE;
import static com.example.kelseyde.olympicgames.Medals.MedalType.GOLD;
import static com.example.kelseyde.olympicgames.Medals.MedalType.SILVER;

public abstract class TeamEvent extends Event {

    private int teamSize;
    private int numberOfTeams;

    public TeamEvent(String title) {
        super(title);
    }

    //getters and setters

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    //methods

    public void addTeam(Team team) {
        boolean sportMatch = (getSport().equals(team.getSport()));
        if (sportMatch) {
            getCompetitors().add(team);
        }
    }

    public boolean isCorrectNumberOfTeams() {
        boolean teamNumberMatch = (getCompetitors().size() == numberOfTeams);
        return teamNumberMatch;
    }

    public void awardMedals(ArrayList<Competitor> medalWinners){

        ArrayList<Team> medalWinnersDownCast = new ArrayList<Team>(downcastCompetitorsIntoTeams(medalWinners));

        medalWinners.get(0).getMedalArray().add(new TeamMedal(GOLD));
        medalWinners.get(1).getMedalArray().add(new TeamMedal(SILVER));
        medalWinners.get(2).getMedalArray().add(new TeamMedal(BRONZE));


        for (Athlete athlete : medalWinnersDownCast.get(0).getAthletes()) {
            athlete.getMedalArray().add(new TeamMedal(GOLD));
        }
        for (Athlete athlete : medalWinnersDownCast.get(1).getAthletes()) {
            athlete.getMedalArray().add(new TeamMedal(SILVER));
        }
        for (Athlete athlete : medalWinnersDownCast.get(0).getAthletes()) {
            athlete.getMedalArray().add(new TeamMedal(BRONZE));
        }
    }

    public ArrayList<Team> downcastCompetitorsIntoTeams(ArrayList<Competitor> competitors) {
        ArrayList<Team> teams = new ArrayList<>();
        for (Competitor competitor : competitors) {
            Team team = (Team) competitor;
            teams.add(team);
        }
        return teams;
    }


}
