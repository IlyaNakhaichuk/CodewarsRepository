package RevRot.app;

import java.util.ArrayList;

class RevRot {

    public static String revRot(String strng, int sz) {
        String result= "";
        if(strng.length()<1 || sz==0 || strng.length()< sz){
            return result;
        }
        if(sz == 8) {
            ArrayList<String> arrayList = new ArrayList();
            ArrayList<String> arrayListFinished = new ArrayList<>(  );
            String[] str = strng.split( "" );
            for (int i = 0; i < str.length; i++) {
                arrayList.add( str[i] );
            }
          //  for(int i=arrayList.size()-1;i>0;i=i-sz){
           //     for(int j=i;j<;j--) {
           //         String symbol = arrayList.get( j );
           //         arrayList.add(,symbol );

           //       }
          //  }
            return result;
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