package com.comp.highScoringWord;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;
import java.util.stream.*;

public class SolutionTest {
    // Reference implmenetation for random tests
    private static String _high(String s) {
        return Stream.of(s.split(" "))
                .sorted(Comparator.comparing((String a) -> a.chars().map(b -> b - 96).sum()).reversed())
                .findFirst().get();
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

    @Test
    public void randomTests() {
        String chars = "      abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            String test = IntStream.range(10, random.nextInt(201))
                    .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining()).trim().replaceAll("\\s+", " ");

            String expected = _high(test);
            String actual = Kata.high(test);

            assertEquals(expected, actual);
        }
    }
}