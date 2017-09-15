package com.example.kelseyde.olympicgames;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Medals.*;

import java.util.ArrayList;

public abstract class Event implements Playable {

    private String title;
    private Sport sport;
    private ArrayList<Competitor> competitors;
    private ArrayList<Medal> medals;

    public Event(String title, Sport sport) {
        this.title = title;
        this.sport = sport;
        this.competitors = new ArrayList<>();
        this.medals = new ArrayList<Medal>();
    }

}
