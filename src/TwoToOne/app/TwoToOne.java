package TwoToOne.app;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        Collator collator = Collator.getInstance(new Locale("en","EN"));
        String s3= s1+s2;
        String s4="";
        for (int i = 0; i < s3.length(); i++) {
            if (!s4.contains(String.valueOf(s3.charAt(i)))) {
                s4 += String.valueOf(s3.charAt(i));
            }
        }
        String[] split = s4.split("");
        Arrays.sort(split, collator);
        String sorted = "";
        for (int i = 0; i < split.length; i++){
            sorted += split[i];
        }
        return  sorted;
    }
}