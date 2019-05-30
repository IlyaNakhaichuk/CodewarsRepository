package DashatizeIt.app;

public class Solution {
    public static String dashatize(int num) {
        return Integer.toString( num ).replaceAll("([13579])","-$1-" ).replaceAll("--","-" ).replaceAll( "^-","" ).replaceAll( "-$","" );
    }

}