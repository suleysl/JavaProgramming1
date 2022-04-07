package day34_GarbageCollection_AccessModifiers;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public Circle(double radius){
        this.radius= radius;
       // pi= 3.14; // do not use any static as a constructor
    }

    static{
        pi=3.14;
        name= "Circle";

    }
}
