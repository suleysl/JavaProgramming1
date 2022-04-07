package day07_Operators;

public class Castings {

    public static void main(String[] args) {

/*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;


 implicit casting: casting smaller type to larger
 explicit casting: casting the larger type to smaller

 */

       float averageScore = 20.5F;  
       byte num1= (byte)averageScore; // explicit casting
        System.out.println("num1 = " + num1);
        short num2 = (short) averageScore;
        System.out.println("num2 = " + num2); //explicit casting
        int num3 = (int) averageScore;
        System.out.println("num3 = " + num3); //explicit casting
        long num4 =(long) averageScore;
        System.out.println("num4 = " + num4); //explicit casting
        float num5 = averageScore;
        System.out.println("num5 = " + num5); // no casting needed
        double num6 = averageScore;
        System.out.println("num6 = " + num6); // implicit casting herep
        









    }






}
