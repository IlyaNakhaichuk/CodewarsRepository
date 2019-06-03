package PositionsAverage;

public class PositionAverage {
    public static double posAverage(String s) {
        String[] str = s.replaceAll( " ", "" ).split( "," );
        int count=0;
        for(int i=0;i<str.length-1;i++){
            for(int k=i+1;k<str.length;k++) {
                for (int j = 0; j < str[i].length(); j++) {
                    if (str[i].charAt( j ) == str[k].charAt( j )) {
                        count++;
                    }
                }
            }
        }
        return (double) count/((str.length*(str.length-1))/2*str[1].length())*100;
    }
}