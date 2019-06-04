package EncodeSimple;


public class Leetspeak extends Encoder {

    public String encode(String source){
        // TODO - Encode the source string into a 133tSp34k string
        String str = source.replaceAll( "(?i)a","4" ).replaceAll( "(?i)e", "3" ).replaceAll( "(?i)l","1" ).replaceAll("(?i)m","/^^\\\\").replaceAll( "(?i)o","0" ).replaceAll( "(?i)u","(_)" );
        return str;
    }

}