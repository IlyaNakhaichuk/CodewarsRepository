package DashatizeIt.app;

public class Solution {
    public static String dashatize(int num) {
        String[] number = Integer.toString( num<0 ?  num = num*(-1): num ).split( "" );
        StringBuilder str = new StringBuilder(  );
        if(Integer.toString( num ).length()<=1){
            return Integer.toString( num );
        }
        for(int i=0; i<number.length;i++){
            if(number[i].charAt( 0 )=='-'){
                continue;
            }
            if(Integer.parseInt(number[i])%2!=0 && i==0){
                str.append( number[i]).append( "-" );
                continue;
            }
            if(Integer.parseInt(number[i])%2!=0 && i==number.length-1){
                if(str.toString().charAt( str.length()-1 )=='-'){
                    str.append( number[i] );
                    continue;
                }
                str.append( "-" ).append( number[i]);
                continue;
            }
            if(Integer.parseInt(number[i])%2!=0){
                if(str.toString().charAt( str.length()-1 )=='-'){
                    str.append( number[i] ).append( "-" );
                    continue;
                }
                str.append( "-" ).append( number[i] ).append( "-" );
                continue;
            }
            str.append( number[i] );
        }
        return str.toString();
    }

}