package day25_CustomMethodOverloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr)); // we are creating a new array because arrays size is fixed.

        double[] arr2 = {1.2, 1.3, 1.4};

        arr2 = addDouble(arr2, 1.5);

        System.out.println(Arrays.toString(arr2));

        char[] arr3 = {'S', 'U', 'L'};

        arr3 = addChar(arr3, 'E');

        System.out.println(Arrays.toString(arr3));

        String[] names = {"Sule", "Mustafa", "Serife", "Mualla"};

       names=  addstring(names, "Fatih");

        System.out.println(Arrays.toString(names));

    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }


    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    public static String[] addstring(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

}

