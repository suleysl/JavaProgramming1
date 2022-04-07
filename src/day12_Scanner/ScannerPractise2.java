package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter true or false: ");

       //boolean result=  scan.nextBoolean();

        System.out.println("Enter your name : ");
        String name= scan.next(); // reads until the space

        System.out.println("name = " + name);


scan.close();






    }
}
