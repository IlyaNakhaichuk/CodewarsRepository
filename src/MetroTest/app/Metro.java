package MetroTest.app;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result=0;
        for(int i=0;i<stops.size();i++){
            if(stops.get( i )[0]<0 || stops.get( i )[1]<0){return 0;}
                result +=stops.get( i )[0];
                result-=stops.get( i )[1];
        }
        return result;
    }
}
