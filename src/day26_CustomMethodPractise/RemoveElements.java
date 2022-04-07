package day26_CustomMethodPractise;

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {

         int[] numbers= {100,200,300,400,500};

       numbers=  removeElement(numbers,1);

        System.out.println(Arrays.toString(numbers));


    }

    // removes the index from the int array, return new array
    public static int [] removeElement(int[] array, int index){

        if(index <0 || index>= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        int[] result= new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){ // if the index of array is matching with the given index
                    continue;
            }
            result[j++]= array[i];
        }
        return result;
    }


    // removes the index from the double array, return new array
    public static double [] removeElement(double[] array, int index){

        if(index <0 || index>= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        double[] result= new double[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){ // if the index of array is matching with the given index
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }


    // removes the index from the char array, return new array
    public static char[] removeElement(char[] array, int index){

        if(index <0 || index>= array.length-1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
            char[] result = new char[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){ // if the index of array is matching with the given index
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }

    // removes the index from the String array, return new array
    public static String [] removeElement(String[] array, int index){

        if(index <0 || index>= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        String[] result= new String[array.length-1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index){ // if the index of array is matching with the given index
                continue;
            }
            result[j++]= array[i];
        }
        return result;
    }
























}
