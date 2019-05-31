package Sort.Array;

public class Kata {
    public static int[] sortArray(int[] array) {
        int mass=0;
        for(int a=0;a<array.length;a++){if(array[a]%2!=0)mass++;}
        int [] arrayNechet=new int[mass];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                arrayNechet[count]=array[i];
                count++;
            }
        }
        for(int i=arrayNechet.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arrayNechet[j]>arrayNechet[j+1]) {
                        int temp = arrayNechet[j];
                        arrayNechet[j] = arrayNechet[j + 1];
                        arrayNechet[j + 1] = temp;
                }
            }
        }
        int num=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                array[i]=arrayNechet[num];
                num++;
            }
        }
        return array;
    }
}