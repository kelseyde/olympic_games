package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.*;

public abstract class TeamEvent extends Event{

    protected int teamSize;

    public TeamEvent(String title) {
        super(title);
    }

    public void addTeam(Team team) {
        boolean sportMatch = (getSport().equals(team.getSport()));
        if (sportMatch) {
            competitors.add(team);
        }
    }

}
