package com.example.kelseyde.olympicgames.Medals;
import org.junit.Before;
import org.junit.Test;

import static com.example.kelseyde.olympicgames.Medals.MedalType.*;
import static org.junit.Assert.*;

public class TeamMedalTest {

    TeamMedal m1;
    TeamMedal m2;
    TeamMedal m3;

    @Before
    public void before() {
        m1 = new TeamMedal(GOLD);
        m2 = new TeamMedal(SILVER);
        m3 = new TeamMedal(BRONZE);
    }

    @Test
    public void testCanGetMedalType() {
        assertEquals(GOLD, m1.getMedalType());
    }

    @Test
    public void testCanSetMedalType() {
        m1.setMedalType(SILVER);
        assertEquals(SILVER, m1.getMedalType());
    }

}