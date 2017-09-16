package com.example.kelseyde.olympicgames.Events.Abstract;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import java.util.ArrayList;

public interface Knockout {

    ArrayList<ArrayList> prepareQuarterFinal();
    ArrayList<Competitor> playQuarterFinal(ArrayList<ArrayList> quarterFinals);
    ArrayList<ArrayList> prepareSemiFinal(ArrayList<Competitor> semiFinalSetup);
    ArrayList<Competitor> playSemiFinal(ArrayList<ArrayList> semiFinals);
    Competitor playFinal(ArrayList<Competitor> finalSetup);

}
