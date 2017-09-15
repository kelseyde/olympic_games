package com.example.kelseyde.olympicgames.Competitors;
import com.example.kelseyde.olympicgames.Medals.AthleteMedal;
import com.example.kelseyde.olympicgames.Medals.Medal;
import com.example.kelseyde.olympicgames.ResultGenerator;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static com.example.kelseyde.olympicgames.Competitors.Nationality.*;
import static com.example.kelseyde.olympicgames.Competitors.Sport.*;
import static com.example.kelseyde.olympicgames.Medals.MedalType.*;
import static org.junit.Assert.*;

public class AthleteTest {

    Athlete athlete1;

    @Before
    public void before() {
        athlete1 = new Athlete("Mo Farah", UK, SPRINT, 10);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Mo Farah", athlete1.getName());
    }

    @Test
    public void testCanSetName() {
        athlete1.setName("Just Mo");
        assertEquals("Just Mo", athlete1.getName());
    }

    @Test
    public void testCanGetNationality() {
        assertEquals(UK, athlete1.getNationality());
    }

    @Test
    public void testCanSetNationality() {
        athlete1.setNationality(CHINA);
        assertEquals(CHINA, athlete1.getNationality());
    }

    @Test
    public void testCanGetSkill() {
        assertEquals(10, athlete1.getSkill());
    }

    @Test
    public void testCanSetSkill() {
        athlete1.setSkill(9);
        assertEquals(9, athlete1.getSkill());
    }

    @Test
    public void testHasMedalArray() {
        assertEquals(0, athlete1.getMedalArray().size());
    }

    @Test
    public void testSetMedalArray() {
        AthleteMedal m1 = new AthleteMedal(GOLD);
        ArrayList<Medal> newMedalArray = new ArrayList<Medal>();
        newMedalArray.add(m1);
        athlete1.setMedalArray(newMedalArray);
        assertEquals(1, athlete1.getMedalArray().size());
    }

    @Test
    public void testHasResultGenerator() {
        assertNotNull(athlete1.getResultGenerator());
    }

    @Test
    public void testSetResultGenerator() {
        ResultGenerator r1 = new ResultGenerator();
        athlete1.setResultGenerator(r1);
        assertEquals(r1, athlete1.getResultGenerator());
    }

}