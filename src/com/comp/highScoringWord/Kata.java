package com.comp.highScoringWord;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String high(String s) {
        Map<Character, Integer> dictionaryCharacterInteger = new HashMap<>();
        char initialChar = 'a';
        for (int i = 1; i < 27; i++) {
            dictionaryCharacterInteger.put( initialChar++, i );
        }
        String[] str = s.split( " " );
        int maxSumOfWordElement = 0;
        String maximumPoints = "";
        for (int i = 0; i < str.length; i++) {
            int sumOfWordElement = 0;
            for (int j = 0; j < str[i].length(); j++) {
                sumOfWordElement += dictionaryCharacterInteger.get( str[i].charAt( j ) );
            }
            if (maxSumOfWordElement < sumOfWordElement) {
                maxSumOfWordElement = sumOfWordElement;
                maximumPoints = str[i];
            }
        }
        return maximumPoints;
    }
}