package day24_CustomMethod_return;

import day04_Variables.SalaryCalculator;
import jdk.swing.interop.SwingInterOpUtils;

public class ReturnMethodsPractise2 {

    public static void main(String[] args) {

       String str1=  grade(100);

if(str1.equals("A")){
    System.out.println("Excellent");
}  else if  (str1.equals("B")){
    System.out.println("Great");
        } else if (str1.equals("C")){
    System.out.println("Good");
}  else if (str1.equals("D")){
    System.out.println("Passed");
}
    }


    public static String grade (int score){

        String result = "";

        if(score <0 || score >100){
            result= "Invalid";

        }else {
            result = ( score >= 90) ? "A" :(score >= 80)? "B" :(score >= 70)? "C" : "D";
        }

        return result;

    }










}
