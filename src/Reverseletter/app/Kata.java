package Reverseletter.app;

import java.util.ArrayList;

public class Kata {
    public static String reverseLetter(final String str) {
        ArrayList<String> strList = new ArrayList<>(  );
        for(int i =0; i<str.toCharArray().length;i++){
            if(str.charAt( i )>=97 && str.charAt( i )<=122){
                strList.add(Character.toString( str.charAt( i )));
            }
        }
        StringBuilder stringBuilder = new StringBuilder( );
        for(int x=strList.size()-1;x>=0;x--){
            stringBuilder.append( strList.get( x ) );
        }
        return stringBuilder.toString();
    }
}