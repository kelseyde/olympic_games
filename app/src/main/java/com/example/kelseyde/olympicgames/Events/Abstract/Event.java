package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Medals.*;

import java.util.ArrayList;

public abstract class Event implements Playable {

    private String title;
    private Sport sport;
    private ArrayList<Competitor> competitors;

    public Event(String title) {
        this.title = title;
        this.competitors = new ArrayList<>();
    }

    //getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(ArrayList<Competitor> competitors) {
        this.competitors = competitors;
    }

    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

}
