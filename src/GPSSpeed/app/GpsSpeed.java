package GPSSpeed.app;

public class GpsSpeed {

    public static int gps(int s, double[] x) {
        double maxDiff = 0.0;
        for(int i = 0; i < x.length -1; i++){
            maxDiff = Math.max(x[i+1] - x[i], maxDiff);
        }
        return (int)Math.floor(maxDiff*3600.0/s);
    }
}