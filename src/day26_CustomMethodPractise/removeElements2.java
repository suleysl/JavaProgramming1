package day26_CustomMethodPractise;

import utilities.ArraysUtility;

public class removeElements2 {


    public static int[] removeElement2(int[] array, int index){

        if(index <0 || index>= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        int[] result = {};


        for (int i = 0; i < array.length; i++) {
            if(i != index){
                ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static double[] removeElement2(double[] array, double index){

        if(index <0 || index>= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        double[] result = {};


        for (int i = 0; i < array.length; i++) {
            if(i != index){
                ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
















}
