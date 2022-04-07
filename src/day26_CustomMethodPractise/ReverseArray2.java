package day26_CustomMethodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    // reverses the array, returns a new arrau
    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result,array[i]);
        }
            return result;
        }



    }

