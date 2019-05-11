package Simple.Transposition;

public class Kata {
    public static String simpleTransposition(String text) {
        String[] arrayText = text.split( "");
        StringBuilder stringBuilder=new StringBuilder(  );
        StringBuilder stringBuilder1= new StringBuilder(  );
        for(int i = 0;i<arrayText.length;i++){
            if(i%2!=0){
                stringBuilder1.append( arrayText[i] );
                continue;
            }
            stringBuilder.append( arrayText[i] );
        }
        return stringBuilder.toString()+stringBuilder1.toString();
    }
}