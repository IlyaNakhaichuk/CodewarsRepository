package EncodeSimple;

import static org.junit.Assert.*;
import org.junit.Test;

public class EncodeSimpleTest {

    Leetspeak myEncoder = new Leetspeak();

    @Test
    public void simpleTest(){
        assertTrue("empty string", myEncoder.encode("").equals(""));
    }
    @Test
    public void simlpeTest2(){
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }
}