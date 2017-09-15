package com.example.kelseyde.olympicgames.Medals;
import org.junit.Before;
import org.junit.Test;

import static com.example.kelseyde.olympicgames.Medals.MedalType.*;
import static org.junit.Assert.*;

public class AthleteMedalTest {

    AthleteMedal m1;
    AthleteMedal m2;
    AthleteMedal m3;

    @Before
    public void before() {
        m1 = new AthleteMedal(GOLD);
        m2 = new AthleteMedal(SILVER);
        m3 = new AthleteMedal(BRONZE);
    }

    @Test
    public void testCanGetType() {
        assertEquals(GOLD, m1.getMedalType());
    }

    @Test
    public void testCanSetType() {
        m2.setMedalType(BRONZE);
        assertEquals(BRONZE, m2.getMedalType());
    }


}