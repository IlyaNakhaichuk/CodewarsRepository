package Order.App;

import java.util.ArrayList;

public class Order {
    public static String order(String words) {
        String [] str = words.split(" ");
        int number=0;
        ArrayList<String> arrayList = new ArrayList<>(  );
        for(int i=0;i<str.length;i++){arrayList.add( "" );}
        for (int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt( j )>47 && str[i].charAt( j )<58){
                    number=Character.getNumericValue( str[i].charAt( j ) );
                    arrayList.set( number -1,str[i] );
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder(  );
        for(int i=0;i<arrayList.size();i++){
            stringBuilder.append( arrayList.get( i ) +" ");
        }
        stringBuilder.deleteCharAt( stringBuilder.length()-1 );
        return stringBuilder.toString();
    }
}