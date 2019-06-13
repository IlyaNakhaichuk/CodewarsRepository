package Asum.app;

public class ASum {

    public static long findNb(long m) {
        long resultOfExponentiation = 0;
        long reisedToNumber = 0;
        for(;resultOfExponentiation < m;) {
            resultOfExponentiation += (long) Math.pow( ++reisedToNumber, 3 );
        }
        return (m==resultOfExponentiation) ? reisedToNumber : -1;
    }
}