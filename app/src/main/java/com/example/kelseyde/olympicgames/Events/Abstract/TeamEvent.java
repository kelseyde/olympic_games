package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Events.Abstract.Event;

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

}
