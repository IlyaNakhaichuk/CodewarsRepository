package MetroTest.app;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
             return stops.stream().mapToInt( value -> value[0]-value[1]).sum();
    }
}
