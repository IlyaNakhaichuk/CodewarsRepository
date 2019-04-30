package RevRot.app;

import static org.junit.Assert.*;
import org.junit.Test;


public class RevRotTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        testing(RevRot.revRot("1234", 0), "");
        testing(RevRot.revRot("", 0), "");
        testing(RevRot.revRot("1234", 5), "");
        String s = "733049910872815764";
        testing(RevRot.revRot(s, 5), "330479108928157");
        String x = "7330499108728157645517604096723459856208";
        testing( RevRot.revRot( x,8 ), "1994033775182780067155464327690480265895" );
    }
}