package EncodeSimple;
import static org.junit.Assert.*;
import org.junit.Test;

public class EncodeSimpleTest {

    @Test
    public void fullTest(){
        Encoder myEncoder = null;
        try {
            myEncoder = new Leetspeak();
        } catch(Exception e) {
            fail("Could not initialize the encoder properly");
        }
        assertNotNull("Encoder is null", myEncoder);
        assertTrue("Empty string should return empty string", myEncoder.encode("").equals(""));
        assertTrue("Null string should return empty string", myEncoder.encode(null).equals(""));
        assertTrue("Failed simple encoding", myEncoder.encode("abcd").equals("4bcd"));
        assertTrue("Failed uppercase encoding", myEncoder.encode("EFGH").equals("3FGH"));
        assertTrue("Failed mixed case encoding", myEncoder.encode("Leetspeak").equals("133tsp34k"));
        assertTrue("Failed complex encoding", myEncoder.encode("3e").equals("33"));
        assertTrue("Failed complex uppercase encoding", myEncoder.encode("109ZUI").equals("109Z(_)I"));
        assertTrue("Failed complex mixed case encoding", myEncoder.encode("^abcD").equals("^4bcD"));
        assertTrue("Failed special encoding", myEncoder.encode("mVw").equals("/^^\\Vw"));
        assertTrue("Failed special letters", myEncoder.encode(" ab cd ef gh ij kl mn op qr st uv wx yz\t\n\r\u2202 AB CD EF GH IJ KL MN OP QR ST UV WX YZ\t\r ").equals(" 4b cd 3f gh ij k1 /^^\\n 0p qr st (_)v wx yz\t\n\r\u2202 4B CD 3F GH IJ K1 /^^\\N 0P QR ST (_)V WX YZ\t\r "));
    }

    public static char[] alphaNum = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789    ".toCharArray();

    @Test
    public void randomTests() {
        Encoder myEncoder = null;
        try {
            myEncoder = new Leetspeak();
        } catch(Exception e) {
            fail("Could not initialize the encoder properly");
        }
        for (int trial = 1; trial <= 100; trial++) {
            StringBuilder sb = new StringBuilder();
            for (int length = (int)(Math.random() * 50); length > 0; length--)
                sb.append(alphaNum[(int)(Math.random() * alphaNum.length)]);
            String source   = sb.toString(),
                    expected = source.replaceAll("(?i)a", "4").replaceAll("(?i)e", "3").
                            replaceAll("(?i)l", "1").replaceAll("(?i)m", "/^^\\\\").
                            replaceAll("(?i)o", "0").replaceAll("(?i)u", "(_)");
            System.out.format("Trial #%d: \"%s\"\n", trial, source);
            assertEquals(expected, myEncoder.encode(source));
        }
    }
}