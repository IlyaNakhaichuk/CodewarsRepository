package DelOccurrenNumb;
import java.util.ArrayList;


public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(elements.length<=0){return elements;}
        if(maxOccurrences==0){return new int[] {};}
        ArrayList<Integer> numberList = new ArrayList<>(  );
        for(int x: elements){numberList.add(x); }
        for(int i=0;i<numberList.size()-1;i++){
            int count=0;
            for(int j=i+1;j<numberList.size();j++){
                if(numberList.get( i )==numberList.get( j )){
                    count++;
                    if(maxOccurrences<=count){
                        numberList.remove( (j--));
                    }
                }
            }
        }
        int[] result = new int[numberList.size()];
        for(int c=0;c<numberList.size();c++){
            result[c]=  numberList.get( c );
        }
        return result;
    }

}
