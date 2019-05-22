package Abbreviatort.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AbbreviatorTests {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
    }

    @Test
    public void test() {
        assertEquals("i1t-a2z-a3n-to-t-t3e", abbr.abbreviate("int-aliz ation_to-t,teqwe"));
    }

}