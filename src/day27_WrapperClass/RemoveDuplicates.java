package day27_WrapperClass;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        int[] arr= {1,1,2,2,3,3,4};

       arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

    }

    // removes the duplicates from the given int array, returns a new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if(! ArraysUtility.contains(result, each)) {
             result=   ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
}
