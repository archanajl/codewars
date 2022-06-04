package com.archanajl.codewars;

import com.archanajl.codewars.permutations.Permutations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;


public class PermutationsTest {

    @Test public void example1() {
        assertEquals( new ArrayList<String>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example2() {
        assertEquals( new ArrayList<String>(Arrays.asList("ab","ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example3() {
        assertEquals( new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()) );
    }
}