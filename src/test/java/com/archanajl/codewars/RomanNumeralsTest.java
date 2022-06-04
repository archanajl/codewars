package com.archanajl.codewars;

import com.archanajl.codewars.romannumerals.RomanNumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() throws Exception {
        assertEquals(RomanNumerals.toRoman(1), "I");
        assertEquals(RomanNumerals.toRoman(2), "II");
    }

    @Test
    public void testFromRoman() throws Exception {
        assertEquals(RomanNumerals.fromRoman("I"), 1);
        assertEquals(RomanNumerals.fromRoman("II"), 2);
}
}