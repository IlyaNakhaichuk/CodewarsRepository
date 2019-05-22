package Detect.Pangram;

import java.util.ArrayList;

public class PangramChecker {
    public boolean check(String sentence) {
        String[] str = sentence.toLowerCase().split( "" );
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!arrayList.contains( str[i] )) {
                if (sentence.toLowerCase().charAt( i ) > 96 && sentence.toLowerCase().charAt( i ) < 123) {
                    arrayList.add( str[i] );
                }
            }
        }
        if (arrayList.size() > 25) {
            return true;
        }
        return false;
    }
}