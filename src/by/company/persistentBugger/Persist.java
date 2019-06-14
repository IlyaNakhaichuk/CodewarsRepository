package by.company.persistentBugger;


class Persist {
    public static int persistence(long n) {
        if (String.valueOf( n ).length()==1){
            return 0;
        }
        int numberOfRepetitions=0;
        do{
            int [] convertidNumber = conversionNumber( n );
            n=1;
            for(int i = 0; i<convertidNumber.length;i++){
                n*=convertidNumber[i];
            }
            numberOfRepetitions++;
            if (String.valueOf( n ).length()>1){
                continue;
            }else {
                return numberOfRepetitions;
            }
            }while (true);
    }

    public static int [] conversionNumber(long n){
        String [] divisionNumbeToString =  String.valueOf( n ).split( "" );
        int [] stringToNumber = new int [divisionNumbeToString.length];
        for (int i = 0; i <divisionNumbeToString.length ; i++) {
            stringToNumber[i]= Integer.parseInt( divisionNumbeToString[i]);
        }
        return stringToNumber;
    }
}