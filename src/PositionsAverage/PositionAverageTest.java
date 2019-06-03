package PositionsAverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class PositionAverageTest {

    private static void assertFuzzy(String s, double exp){
        System.out.println("Testing " + s);
        boolean inrange;
        double merr = 1e-9;
        double actual = PositionAverage.posAverage(s);
        inrange = Math.abs(actual - exp) <= merr;
        if (inrange == false) {
            System.out.println("Expected mean must be near " + exp +", got " + actual);
        }
        System.out.println("-");
        assertEquals(true, inrange);
    }
    @Test
    public void test() {
        assertFuzzy("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096", 26.6666666667);
        assertFuzzy("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490", 29.2592592593);
        assertFuzzy("449404, 099090, 600999, 694460, 996066, 906406, 644994, 699094, 064990, 696046", 24.4444444444);
        assertFuzzy("660999, 969060, 044604, 009494, 609009, 640090, 994446, 949940, 046999, 609444", 22.9629629630);
        assertFuzzy("996060, 606494, 964494, 460409, 609449, 969600, 960944, 960006, 666049, 090996", 24.8148148148);

        assertFuzzy("40664064, 60460960, 00669664, 94040464, 04006499, 00466666, 90966460, 64494990", 29.0178571429);
        assertFuzzy("64040600, 64464440, 60006040, 49609906, 46664409, 99464446, 90446964, 96940090", 20.5357142857);
        assertFuzzy("99494909, 60004094, 60090496, 64664669, 49909604, 49999064, 46009964, 44494444", 25.4464285714);
        assertFuzzy("46904946, 60996660, 64040460, 40449469, 46440460, 96090699, 06600440, 44046966", 27.6785714286);
        assertFuzzy("46099969, 64096999, 44949949, 06409969, 09064604, 90490494, 04600696, 94469969", 25.8928571429);
        assertFuzzy("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444", 100);
        assertFuzzy("0, 0, 0, 0, 0, 0, 0, 0", 100);
        assertFuzzy("0, 0, 1", 33.3333333333);
    }
    private static int randint(int min, int max) {
        return (int)(min + Math.random() * ((max - min) + 1));
    }
    private static String doOne1(int k) {
        String[] t = new String[] {"9", "6", "4"};
        int i = 0; String res = "";
        int n = randint(0, 2);
        while (i < k) {
            res += t[n];
            i += 1;
        }
        return res;
    }
    private static String doOne(int k) {
        String[] t = new String[] {"0", "9", "6", "4"};
        int i = 0; String res = "";
        while (i < k) {
            int n = randint(0, 3);
            res += t[n];
            i += 1;
        }
        return res;
    }
    private static String doEx(int lgset, int one) {
        int i = 0; String res = "";
        int n = randint(0, 100);
        if (n % 5 == 0) {
            String ss = doOne1(one);
            while (i < lgset) {
                res += ss + ", ";
                i += 1;
            }
        } else {
            while (i < lgset) {
                String r = doOne(one);
                res += r + ", ";
                i += 1;
            }
        }
        return res.substring(0, res.length() - 2);
    }

    private static double pairPercentage(String s1, String s2) {
        int lg = s1.length(); int count = 0;
        for (int pos = 0; pos < lg; pos++) {
            if (s1.charAt(pos) == s2.charAt(pos))
                count += 1;
        }
        return (double)count / lg;
    }
    private static double posAverageKA(String s) {
        String[] strings = s.split(", ");
        double result = 0.0; int cnt = 0; int lg = strings.length;
        for (int k = 0; k < lg; k++) {
            for (int i = k + 1; i < lg; i++) {
                result += pairPercentage(strings[k], strings[i]);
                cnt += 1;
            }
        }
        result = 100.0 * result / cnt;
        return Math.floor(result * Math.pow(10.0, 10)) / Math.pow(10.0, 10);
    }
    @Test
    public void test1() {
        System.out.println("Random Tests ****");
        for (int i = 0; i < 200; i++) {
            int m = randint(15, 25);
            int k = randint(10, 20);
            String s = doEx(m, k);
            double sol = posAverageKA(s);
            assertFuzzy(s, sol);
        }
    }
}