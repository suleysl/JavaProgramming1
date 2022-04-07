package day27_WrapperClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr=  {10,20,30,30,30,30,40,50,60};

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));
    }


    //replaces all the matching old values of the int array with the assigned new value.
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if( array[i] == oldValue ){
                array[i]= newValue;
            }
        }

        return array;
    }


    //replaces all the matching old values of the double array with the assigned new value.
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if( array[i] == oldValue ){
                array[i]= newValue;
            }
        }

        return array;
    }


    //replaces all the matching old values of the char array with the assigned new value.
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if( array[i] == oldValue ){
                array[i]= newValue;
            }
        }

        return array;
    }


    //replaces all the matching old values of the String array with the assigned new value.
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if( array[i].equals(oldValue)){
                array[i]= newValue;
            }
        }

        return array;
    }





















}
