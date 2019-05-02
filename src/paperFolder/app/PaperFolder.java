package paperFolder.app;

public class PaperFolder {
    public static Long fold(Double distance) {
        double result=0;
        if(distance< 0){
            return null;
        }
        for(int i=0;;i++){
            result = (0.0001*Math.pow( 2,i ));
            if(result>=distance){
                return Long.valueOf((long)i);
            }
        }
    }
}
