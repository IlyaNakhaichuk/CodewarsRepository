package RevRot.app;

import java.util.ArrayList;

class RevRot {

    public static String revRot(String strng, int sz) {
        String result= "";
        if(strng.length()<1 || sz==0 || strng.length()< sz){
            return result;
        }
        if(sz%2==0) {
            ArrayList<String> arrayList = new ArrayList();
            ArrayList<String> arrayListFinished = new ArrayList<>(  );
            String[] str = strng.split( "" );
            for (int i = 0; i < str.length; i++) {
                arrayList.add( str[i] );
            }
            while(arrayList.size()>=sz){
            //for(int i=0;i<arrayList.size();i++){
                for(int j=sz-1;j>=0;j--) {
                    arrayListFinished.add(arrayList.get( j ));
                    arrayList.remove( j );
                  }
            }
            StringBuilder stringBuilder = new StringBuilder(  );
            for(int x=0;x<arrayListFinished.size();x++){
                stringBuilder.append( arrayListFinished.get( x ) );
            }
            return stringBuilder.toString();
        }
        ArrayList<String> arrayList = new ArrayList<>(  );
        String[] str = strng.split( "" );
        for(int i=0;i<strng.length();i++){
            arrayList.add( str[i] );
        }
        for(int i=0; i<arrayList.size();i=i+sz) {
            if (i+sz<arrayList.size()) {
                String symbol = arrayList.get( i );
                arrayList.add( i + sz, symbol );
                arrayList.remove( i );
            }else{
                for(int x=i;x<arrayList.size();x++ ){
                    arrayList.remove( x );
                }
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(  );
        for(int x=0;x<arrayList.size()-1;x++){
            stringBuilder.append( arrayList.get( x ) );
        }
        return stringBuilder.toString();
    }
}