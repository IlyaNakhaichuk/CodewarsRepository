package Abbreviatort.app;


public class Abbreviator {

    public String abbreviate(String string) {
        StringBuilder stringBuilder = new StringBuilder(  );
        if(string.contains( "-")||string.contains( " " )){
            String[] str = string.split("-|\\_|\\ |\\," );
            for(int i = 0; i<str.length;i++){
                if(str[i].length()<=2) {
                    stringBuilder.append( str[i] ).append( "-" );
                }else {
                    stringBuilder.append(str[i].charAt( 0 )).append( str[i].length()-2 ).append( str[i].charAt( str[i].length()-1 ) ).append( "-" );
                }
            }
            return stringBuilder.deleteCharAt( stringBuilder.length()-1 ).toString();
        }
        stringBuilder.append( string.charAt( 0 ) ).append( string.length()-2 ).append( string.charAt( string.length()-1 ) );
        return stringBuilder.toString();
    }

}