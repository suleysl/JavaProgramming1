package day34_GarbageCollection_AccessModifiers;


import day32_Constructor.Car;

import java.util.Locale;

public class GarbageCollection {

    private static Car car1;

    public static void main(String[] args) {


        /* String str = null; // null is not an object, without an object instance can not be used

        System.out.println(str.toUpperCase());

         */

        String str = "Wooden Spoon"; // not eligible for garbage collection
        System.out.println(str);


        Car car1= new Car("Toyota");
       // car1= null;

        System.out.println(car1);




    }
}
