package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Athlete;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Nationality;
import com.example.kelseyde.olympicgames.Competitors.Team;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.kelseyde.olympicgames.Competitors.Nationality.*;
import static com.example.kelseyde.olympicgames.Competitors.Sport.*;
import static com.example.kelseyde.olympicgames.Medals.MedalType.*;
import static org.junit.Assert.*;

public class SwimmingEventTest {

    Athlete a1;
    Athlete a2;
    Athlete a3;
    Athlete a4;
    Athlete a5;
    Athlete a6;
    Athlete a7;
    Athlete a8;
    SwimmingEvent s1;

    @Before
    public void before() {
        a1 = new Athlete("A", UK, SWIMMING, 1);
        a2 = new Athlete("B", FRANCE, SWIMMING, 2);
        a3 = new Athlete("C", GERMANY, SWIMMING, 5);
        a4 = new Athlete("D", JAMAICA, SWIMMING, 8);
        a5 = new Athlete("E", USA, SWIMMING, 3);
        a6 = new Athlete("F", RUSSIA, SWIMMING, 4);
        a7 = new Athlete("G", BRAZIL, SWIMMING, 7);
        a8 = new Athlete("H", CHINA, SWIMMING, 6);
        s1 = new SwimmingEvent("Women's Swimming");
        Collections.addAll(s1.getCompetitors(), a1, a2, a3, a4, a5, a6, a7, a8);
    }

    @Test
    public void testHasEightAthletes() {
        assertEquals(8, s1.getCompetitors().size());
    }

    @Test
    public void testIsCorrectNumberOfAthletes(){
        assertEquals(true, s1.isCorrectNumberOfAthletes());
    }

    @Test
    public void testPlayJamaicaWinsGold(){
        ArrayList<Competitor> medalWinners = s1.play();
        assertEquals(Nationality.JAMAICA, medalWinners.get(0).getNationality());
    }

    @Test
    public void testPlayBrazilWinsSilver(){
        ArrayList<Competitor> medalWinners = s1.play();
        assertEquals(Nationality.BRAZIL, medalWinners.get(1).getNationality());
    }

    @Test
    public void testPlayChinaWinsBronze(){
        ArrayList<Competitor> medalWinners = s1.play();
        assertEquals(Nationality.CHINA, medalWinners.get(2).getNationality());
    }

    @Test
    public void testCanAwardMedals() {
        ArrayList<Competitor> medalWinners = s1.play();
        s1.awardMedals(medalWinners);
        assertEquals(GOLD, medalWinners.get(0).getMedalArray().get(0).getMedalType());
        assertEquals(SILVER, medalWinners.get(1).getMedalArray().get(0).getMedalType());
        assertEquals(BRONZE, medalWinners.get(2).getMedalArray().get(0).getMedalType());
    }


}