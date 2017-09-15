package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Medals.*;

import java.util.ArrayList;

public abstract class Event implements Playable {

    protected String title;
    protected Sport sport;
    protected ArrayList<Competitor> competitors;
    protected ArrayList<Medal> medals;

    public Event(String title) {
        this.title = title;
        this.competitors = new ArrayList<>();
        this.medals = new ArrayList<Medal>();
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

    public ArrayList<Medal> getMedals() {
        return medals;
    }

    public void setMedals(ArrayList<Medal> medals) {
        this.medals = medals;
    }

}
