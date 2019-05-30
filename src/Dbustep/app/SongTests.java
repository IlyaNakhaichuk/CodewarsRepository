package Dbustep.app;

import  org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SongTests {
    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
    @Test
    public void Test3()
    {
        assertEquals("JKD WBIRAQKF YE WV", new Dubstep().SongDecoder("WUBJKDWUBWUBWBIRAQKFWUBWUBYEWUBWUBWUBWVWUBWUB"));
    }

    @Test
    public void Test4()
    {
        assertEquals("KSDHEMIXUJ R S H", new Dubstep().SongDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test5()
    {
        assertEquals("Q QQ I WW JOPJPBRH", new Dubstep().SongDecoder("QWUBQQWUBWUBWUBIWUBWUBWWWUBWUBWUBJOPJPBRH"));
    }

    @Test
    public void Test6()
    {
        assertEquals("O IPVCQAFWY Q XHDKCPYKCTWWY V FZ", new Dubstep().SongDecoder("WUBWUBOWUBWUBWUBIPVCQAFWYWUBWUBWUBQWUBWUBWUBXHDKCPYKCTWWYWUBWUBWUBVWUBWUBWUBFZWUBWUB"));
    }

    @Test
    public void Test7()
    {
        assertEquals("YYRTSMNWU C C FSYUINDWOBV F AU V JB", new Dubstep().SongDecoder("WUBYYRTSMNWUWUBWUBWUBCWUBWUBWUBCWUBWUBWUBFSYUINDWOBVWUBWUBWUBFWUBWUBWUBAUWUBWUBWUBVWUBWUBWUBJB"));
    }

    @Test
    public void Test8()
    {
        assertEquals("KSDHEMIXUJ R S H", new Dubstep().SongDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test9()
    {
        assertEquals("A", new Dubstep().SongDecoder("AWUBWUBWUB"));
    }

    @Test
    public void Test10()
    {
        assertEquals("A B C D", new Dubstep().SongDecoder("AWUBBWUBCWUBD"));
    }

    @Test
    public void Test11()
    {
        assertEquals("W U B", new Dubstep().SongDecoder("WUBWWUBWUBWUBUWUBWUBBWUB"));
    }

    @Test
    public void Test12()
    {
        assertEquals("WU BW UB", new Dubstep().SongDecoder("WUWUBBWWUBUB"));
    }

    @Test
    public void Test13()
    {
        assertEquals("WUAB", new Dubstep().SongDecoder("WUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUABWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUB"));
    }

    @Test
    public void Test14()
    {
        assertEquals("U", new Dubstep().SongDecoder("U"));
    }

    @Test
    public void Test15()
    {
        assertEquals("WU", new Dubstep().SongDecoder("WUWUB"));
    }

    @Test
    public void Test16()
    {
        assertEquals("UB",new Dubstep().SongDecoder("UBWUB"));
    }

    @Test
    public void Test17()
    {
        assertEquals("WU UB U",new  Dubstep().SongDecoder("WUWUBUBWUBUWUB"));
    }

    @Test
    public void Test18()
    {
        assertEquals("W A", new Dubstep().SongDecoder("WUBWWUBAWUB"));
    }

    @Test
    public void Test19()
    {
        assertEquals("WUUUUU",new  Dubstep().SongDecoder("WUUUUU"));
    }

    @Test
    public void Test20()
    {
        assertEquals("A", new Dubstep().SongDecoder("WUBWUBA"));
    }
}