package Solution.app;

public class Kata{
    public static int sumTriangularNumbers(int n){
        if(n<=0){ return 0;}
        int number=0;
        int sumNumber=0;
        int[] [] numberArray=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                numberArray[i][j]=++number;
                sumNumber += numberArray[i][i];
            }
        }
        return sumNumber;
    }
}