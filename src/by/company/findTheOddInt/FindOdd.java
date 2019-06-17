package by.company.findTheOddInt;

import java.util.ArrayList;

public class FindOdd {
    public static int findIt(int[] stringOfNumbers) {
        ArrayList<Integer> dictionaryOfNumber = new ArrayList<>(  );
        for (int i = 0; i <stringOfNumbers.length ; i++) {
            if(!dictionaryOfNumber.contains( stringOfNumbers[i] )){
                dictionaryOfNumber.add( stringOfNumbers[i] );
            }
        }
        for (int i = 0; i <dictionaryOfNumber.size(); i++) {
            int numberOfDublicateNumbers=0;
            for (int j = 0; j <stringOfNumbers.length ; j++) {
                if(dictionaryOfNumber.get( i )==stringOfNumbers[j]){
                    numberOfDublicateNumbers++;
                }
            }
            if(numberOfDublicateNumbers%2!=0){
                return dictionaryOfNumber.get( i );
            }

        }
        return 0;
    }
}