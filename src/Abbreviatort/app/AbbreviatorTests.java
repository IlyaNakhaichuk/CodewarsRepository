package Abbreviatort.app;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class AbbreviatorTests {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
        assertEquals("i18n i19X", abbr.abbreviate("internationalization internationalizationX"));
    }

    @Test
    public void testAccessibility() {
        assertEquals("a11y", abbr.abbreviate("accessibility"));
    }

    @Test
    public void testAccessibilityCaps() {
        assertEquals("A11y", abbr.abbreviate("Accessibility"));
    }

    @Test
    public void testLongSentence() {
        assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", abbr.abbreviate("You need, need not want, to complete this code-wars mission"));
    }

    @Test
    public void testThrowTheKitchenSinkAtEm() {
        String[] joins = {", ", "-", ": ", "; ", ". ", "'", "_", " ", "5"};
        String[] words =            {"cat", "mat", "doggy", "balloon", "sits", "sat", "a", "is", "on", "the", "monolithic", "double-barreled"};
        String[] wordsAbbreviated = {"cat", "mat", "d3y",   "b5n",     "s2s",  "sat", "a", "is", "on", "the", "m8c",        "d4e-b6d"};
        Random rand = new Random();

        for (int i=0; i<100; i++) {
            StringBuilder input = new StringBuilder();
            StringBuilder expected = new StringBuilder();
            int upper = rand.nextInt(10) + 1;
            for (int j=0; j<upper; j++) {
                int wordIndex = rand.nextInt(joins.length);
                if (input.length() > 0) {
                    input.append(joins[wordIndex]);
                    expected.append(joins[wordIndex]);
                }
                wordIndex = rand.nextInt(words.length);
                input.append(words[wordIndex]);
                expected.append(wordsAbbreviated[wordIndex]);
            }
            assertEquals("Input: '" + input.toString() + "'", expected.toString(), abbr.abbreviate(input.toString()));
        }
    }

}