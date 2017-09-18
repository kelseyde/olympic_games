package com.example.kelseyde.olympicgames.Events;
import com.example.kelseyde.olympicgames.Competitors.Athlete;
import com.example.kelseyde.olympicgames.Competitors.Competitor;
import com.example.kelseyde.olympicgames.Competitors.Nationality;
import com.example.kelseyde.olympicgames.Competitors.Sport;
import com.example.kelseyde.olympicgames.Events.Abstract.Event;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class EventTest {

    Event e1;

    @Before
    public void before() {
        e1 = new FootballEvent("Women's Football");
    }

    @Test
    public void testGetName() {
        assertEquals("Women's Football", e1.getTitle());
    }

    @Test
    public void testSetName() {
        e1.setTitle("Test");
        assertEquals("Test", e1.getTitle());
    }

    @Test
    public void testGetSport() {
        e1.setSport(Sport.FOOTBALL);
        assertEquals(Sport.FOOTBALL, e1.getSport());
    }

    @Test
    public void testSetCompetitors() {
        ArrayList<Competitor> test = new ArrayList<Competitor>();
        test.add(new Athlete("B", Nationality.GERMANY, Sport.FOOTBALL, 2));
        e1.setCompetitors(test);
        assertEquals(1, e1.getCompetitors().size());
    }

}
