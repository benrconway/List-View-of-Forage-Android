package com.example.user.foragelistview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20/09/2017.
 */
public class ForageTest {
    @Test
    public void testClass() {
        Forage forage = new Forage(Edible.FRUIT, "Blackberry", Season.SUMMER);
        assertEquals(Edible.FRUIT, forage.getType());
        assertEquals("Blackberry", forage.getName());
        assertEquals(Season.SUMMER, forage.getSeasonAvailable());
    }
}