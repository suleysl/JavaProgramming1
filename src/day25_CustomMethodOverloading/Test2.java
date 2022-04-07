package day25_CustomMethodOverloading;

import utilities.ArraysUtility;

import java.lang.reflect.Array;

public class Test2 {

    public static void main(String[] args) {


        int[] arr1= {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("_______________________________________________________");

        double[] arr2 = {1.5,2.5,3.5,5.4};
        ArraysUtility.printEachElement(arr2);

        System.out.println("________________________________________________________");

        char[] arr3 = {'A', 'B', 'C', 'D' };
        ArraysUtility.printEachElement(arr3);

        System.out.println("________________________________________________________");

        String[] arr4= {"Sule", "Yesil", "Fitnat"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("_________________________________________________________");

        int[] n1 = {1,2,3,4,5,847356};
        int max1= ArraysUtility.maxNumber(n1);

        System.out.println("max1 = " + max1);

        System.out.println("_________________________________________________________");

        double[] n2 = {2.6,6.8,4.6,3.8,23.6};
        double max2= ArraysUtility.maxNumber(n2);

        System.out.println("max2 = " + max2);

        System.out.println("_________________________________________________________");

        int[] a1= {1,2,3,4,5,6,7};

        boolean r1= ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);




    }
}
