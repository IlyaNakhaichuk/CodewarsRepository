package EncodeSimple;


import java.util.HashMap;
import java.util.Map;

public class Leetspeak extends Encoder {

    public String encode(String source){
        if(source == null || source == ""){return "";}

        Map<Character,String> map = new HashMap<>(  );
        map.put('a', "4");
        map.put('e', "3");
        map.put('l', "1");
        map.put('m', "/^^\\");
        map.put('o', "0");
        map.put('u', "(_)");
        StringBuilder out = new StringBuilder(  );
        for(char x : source.toCharArray()){
            String temp = map.get( Character.toLowerCase( x ) );
            if(temp == null) temp = Character.toString( x );
            out.append( temp );
        }
        return out.toString();
    }

}