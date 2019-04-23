package RotateNumber;
import java.util.ArrayList;
public class MaxRotate {
    public static long maxRot (long n) {
        //long result = 0;
        String[] numArray= Long.toString( n ).split( "" );
        ArrayList<String> number = new ArrayList();
        for(int i=0;i<numArray.length;i++){
            number.add(numArray[i]);
        }
        for(int x=0;x<number.size();x++){
            if(number.size()<=1){break;}
            int element1=Integer.parseInt( number.get( x ) );
            int element2=Integer.parseInt( number.get( x+1 ) );
            if(element1<element2) {
                number.add( number.get( x ) );
                number.remove( x );
            }
            if(element1>element2 && element1 != element2){
                break;
            }
        }
        StringBuilder str = new StringBuilder(  );
        for(int y=0;y<number.size();y++){
            str.append(number.get( y ) );
        }
        return Long.valueOf( str.toString() );
    }
}