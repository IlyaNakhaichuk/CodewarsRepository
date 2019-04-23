package Sequence.app;

public class SequenceSum{

    public static String showSequence(int value){
        StringBuilder str = new StringBuilder();
        int result=0;
        for(int i=0;i<=value;i++){
            str.append(i).append( '+' );
            result += i;
        }
        str.deleteCharAt(str.length()-1);
        return str.append( ' ' ).append('=').append( ' ' ).append( result ).toString();

        //for
        //  while
    }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}