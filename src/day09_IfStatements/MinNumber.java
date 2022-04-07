package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

     int n1 = 200;
     int n2 = 200;

     boolean n1IsTheMin = n1 < n2;
     boolean n2IsTheMin = n2 <n1;
     boolean equal = n1 == n2;

     if(n1IsTheMin){    // if n1 is the minimum number
         System.out.println(n1 + " is the minimum number");}

     if(n2IsTheMin){  //if n2 is the minimum number
         System.out.println(n2 + " is the minimum number");}

     if(equal){   //if n1 is equal to n2
         System.out.println(" equal");}









    }
}
