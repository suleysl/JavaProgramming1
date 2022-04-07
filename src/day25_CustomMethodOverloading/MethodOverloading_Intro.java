package day25_CustomMethodOverloading;

import java.util.Arrays;

public class MethodOverloading_Intro {

    public static void main(String[] args) {


        int[] intArray= {5,6,0,-1,3,4};

        Arrays.sort(intArray);

        double [] doubleArray= {10.5,11.5,5.5,4.5};

        Arrays.sort(doubleArray);

        char[] charArray= {'E', 'F', 'G', 'H', 'I'};
        Arrays.sort(charArray);

        int sum1 = sumOfNumbers(10,20);

        int sum2 = sumOfNumbers(10,20,40);

        System.out.println("sum2 = " + sum2);
        System.out.println("sum1 = " + sum1);

        double sum3= sumOfNumbers(18.2, 30.7);

        System.out.println("sum3 = " + sum3);



    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static int sumOfNumbers (int num1, int num2 , int num3){
        return num1 + num2 + num3;
    }

    // multiple methods having same name is called method overloading.
    // easier to remember the one method name rather than more methods.
    // Parameters must always be different in order to use the method overloading

}
