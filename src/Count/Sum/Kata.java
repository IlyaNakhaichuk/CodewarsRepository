package Count.Sum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Kata{
    public static int[] countPositivesSumNegatives(int[] input) throws  NullPointerException {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else {
                sum += input[i];
            }
        }
    int[] result = new int[]{count, sum};
        return result; //return an array with count of positives and sum of negatives
    }
}
