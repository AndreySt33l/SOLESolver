package com.xsteel;

public class Algorithm {
    public static boolean contains(double[] array, double value) {
        boolean result = false;

        for(double i : array){
            if (i == value){
                result = true;
                break;
            }
            else
                result = false;
        }

        return result;
    }

    public static int getIndexOfValue(double[] array, double value) {
        int index = -1;

        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                index = i;
                break;
            }
        }

        return index;
    }
}
