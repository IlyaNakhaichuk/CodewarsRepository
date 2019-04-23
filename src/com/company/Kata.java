package com.company;
public class Kata {
    public static String HighAndLow(String numbers) {
        int highElement=0;
        int lowElement=0;
        String [] charArray = numbers.split(" ");
        int [] numberArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i=0;i<charArray.length;i++){
            numberArray[i]=Integer.parseInt(charArray[i]);
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > highElement) {
                highElement = numberArray[i];
            }
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < lowElement) {
                lowElement = numberArray[i];
            }
        }
        String result = Integer.toString(highElement ) + " " + Integer.toString(lowElement);
        return result;
    }
}
