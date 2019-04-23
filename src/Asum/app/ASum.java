package Asum.app;

public class ASum {

    public static long findNb(long m) {
        long accum=0;
        for(long n=0;;n++){
            accum+=Math.pow(n,3);
            if(accum==m){
                return n;
            }
            if(accum>m){
                n=n-100;
                accum -= Math.pow(n,3);
                if(accum<m) {
                    return n;
                }
                    return -1;
                }
            }
        }
    }