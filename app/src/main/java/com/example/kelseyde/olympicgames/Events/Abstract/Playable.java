package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import java.util.ArrayList;

public interface Playable {

    void prepareMedals();

    void awardMedals();

    ArrayList<Competitor> play();

}
