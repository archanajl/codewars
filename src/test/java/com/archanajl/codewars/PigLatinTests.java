package com.archanajl.codewars;

import com.archanajl.codewars.stringmanipulation.PigLatin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}