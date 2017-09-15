package com.example.kelseyde.olympicgames.Competitors;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static com.example.kelseyde.olympicgames.Competitors.Nationality.*;
import static com.example.kelseyde.olympicgames.Competitors.Sport.*;
import static org.junit.Assert.*;

public class TeamTest {

    Athlete mo;
    Athlete usain;
    Team uk;

    @Before
    public void before() {
        mo = new Athlete("Mo", UK, RELAY, 10);
        usain = new Athlete("Usain Bolt", JAMAICA, RELAY, 10);
        uk = new Team("UK Men's Sprint Team", UK, RELAY);
        uk.getAthletes().add(mo);
    }

    @Test
    public void testGetName() {
        assertEquals("UK Men's Sprint Team", uk.getName());
    }

    @Test
    public void testSetName() {
        uk.setName("UK TEAM");
        assertEquals("UK TEAM", uk.getName());
    }

    @Test
    public void testGetNationality() {
        assertEquals(UK, uk.getNationality());
    }

    @Test
    public void testSetNationality() {
        uk.setNationality(CHINA);
        assertEquals(CHINA, uk.getNationality());
    }

    @Test
    public void testGetSport() {
        assertEquals(RELAY, uk.getSport());
    }

    @Test
    public void testSetSport() {
        uk.setSport(SWIMMING);
        assertEquals(SWIMMING, uk.getSport());
    }

    @Test
    public void testGetAthletes() {
        assertEquals(1, uk.getAthletes().size());
    }

    @Test
    public void testSetAthletes() {
        ArrayList<Athlete> newAthletes = new ArrayList<>();
        uk.setAthletes(newAthletes);
        assertEquals(0, uk.getAthletes().size());
    }

    @Test
    public void testHasResultGenerator() {
        assertNotNull(uk.getResultGenerator());
    }

    @Test
    public void testAddAthleteSuccess() {
        uk.getAthletes().remove(0);
        assertEquals(0, uk.getAthletes().size());
        uk.addAthlete(mo);
        assertEquals(1, uk.getAthletes().size());
    }

    @Test
    public void testAddAthleteFailure() {
        uk.addAthlete(usain);
        assertEquals(1, uk.getAthletes().size());
    }

    @Test
    public void testCanGetTeamSkill() {
        assertEquals(10, uk.getTeamSkill());
    }



}