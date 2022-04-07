package day09_IfStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if(leapYear){
            System.out.println("year" + "is leap year.");
        }
        if(leapYear){
            System.out.println("year" + "is NOT leap year.");
        }

        System.out.println("_________________________________________");

        if(leapYear){
            System.out.println("Year "+year+" is a leap year");
        }else{
            System.out.println("Year "+year+" is not a leap year");
        }


    }
}
