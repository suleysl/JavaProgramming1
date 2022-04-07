package day26_CustomMethodPractise;

import java.lang.reflect.Array;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr= {1,1,1,1,1,2,2,3,3,3,4,4,4,4,5,5,5,6};

       int n= frequencyOfElement(arr,1);
        System.out.println(n);
    }

    //returns the frequency of the given int element from the given array.
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for(int each : array){
            if(each == element){
                count++;
            }

        }
        return count;
    }


    //returns the frequency of the given double element from the given array.
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for(double each : array){
            if(each == element){
                count++;
            }

        }
        return count;
    }


    //returns the frequency of the given char element from the given array.
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for(char each : array){
            if(each == element){
                count++;
            }

        }
        return count;
    }


    //returns the frequency of the given String element from the given array.
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for(String each : array){
            if(each == element){
                count++;
            }

        }
        return count;
    }















}
