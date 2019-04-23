package GPSSpeed.app;

public class GpsSpeed {

    public static int gps(int s, double[] x) {
        int[] speed= new int[x.length/2];
        int max=0;
        int index=0;
        for(int i=0;i<x.length;i++) {
                speed[index] = (int) ((3600 * (-1) * (x[i] - x[++i])) / s);
                index++;
                if(index==speed.length){break;}
        }
        for (int a=0; a<speed.length;a++){
            if(max<speed[a]){
                max=speed[a];
            }
        }
        return max;
    }
}