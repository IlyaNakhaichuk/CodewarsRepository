package App.accum;

import java.util.ArrayList;

public class Accumul {

    public static String accum(String s) {
        String [] str = s.split("");
        String result="";
        ArrayList<String> arr1 = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            arr1.add(str[i].toUpperCase());
            for(int y=i-1;y>=0;y--){
                 arr1.add(str[i].toLowerCase());
             }
             arr1.add("-");
        }
        for (int i=0;i<arr1.size()-1;i++){
            result += arr1.get(i);
        }
        return result;
    }
}