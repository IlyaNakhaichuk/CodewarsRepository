package Abbreviatort.app;


import java.util.ArrayList;

public class Abbreviator {
    public String abbreviate(String string) {
        if(string.length()<=3){
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(  );
        ArrayList<String> symbol = new ArrayList(  );
        for(int i =0; i<string.length();i++){
            if(string.charAt( i )>0 && string.charAt( i )<65 || string.charAt( i )>90 && string.charAt( i )<97 || string.charAt( i )>122 && string.charAt( i )<127  ){
                symbol.add( Character.toString( string.charAt( i ) ));
            }
        }
        symbol.add( "q" );
        int count=0;
        //if(string.contains( "-")||string.contains( " " )||string.contains( "5" )){
        if(symbol.size()!=1){
            String[] str = string.split("-|\\,|\\.|\\,|\\/|\\?|\\:|\\;|\\'|\\*|\\ |\\_|\\[|\\]|5");
            for(int i = 0; i<str.length;i++){
                if(str[i].length()<=3) {
                    stringBuilder.append( str[i] ).append(symbol.get( count++ ) );
                }else {
                    stringBuilder.append(str[i].charAt( 0 )).append( str[i].length()-2 ).append( str[i].charAt( str[i].length()-1 ) ).append( symbol.get( count++) );
                }
            }
            return stringBuilder.deleteCharAt( stringBuilder.length()-1 ).toString();
        }
        stringBuilder.append( string.charAt( 0 ) ).append( string.length()-2 ).append( string.charAt( string.length()-1 ) );
        return stringBuilder.toString();
    }

}