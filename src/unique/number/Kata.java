package unique.number;
import java.util.ArrayList;

public class Kata {
    public static double findUniq(double arr[]) {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> arrayList1 =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add( arr[i] );
        }
      for(int i=0;i<arrayList.size();i++) {
           double x = arrayList.get( i );
           if(!arrayList1.contains( x )){
               arrayList1.add( x );
               arrayList.remove( i );
           }
       }
      for(int i=0;i<arrayList1.size();i++)
          if(!arrayList.contains( arrayList1.get( i ) ))
              return arrayList1.get( i );
        return arrayList.get( 0 );
    }
}