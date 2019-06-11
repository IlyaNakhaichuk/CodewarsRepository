package EncodeSimple;


import java.util.HashMap;
import java.util.Map;

public class Leetspeak extends Encoder {

    public String encode(String source){
        if(source == null || source == ""){return "";}

        Map<Character,String> characterDictionary = new HashMap<>(  );
        characterDictionary.put('a', "4");
        characterDictionary.put('e', "3");
        characterDictionary.put('l', "1");
        characterDictionary.put('m', "/^^\\");
        characterDictionary.put('o', "0");
        characterDictionary.put('u', "(_)");
        StringBuilder out = new StringBuilder(  );
        for(char x : source.toCharArray()){
            String temp = characterDictionary.get( Character.toLowerCase( x ) );
            if(temp == null) temp = Character.toString( x );
            out.append( temp );
        }
        return out.toString();
    }

}