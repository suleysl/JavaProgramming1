package day13_StringClass;

import java.util.Scanner;

public class printLongestString {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first string of text: ");
        String result1= scan.nextLine();

        System.out.println("Enter your second string of text: ");
        String result2= scan.nextLine();

        scan.close();

        if(result1.length() > result2.length()){ // if result one is longer than result 2 print result 1
            System.out.println(result1);
        }else if(result2.length()> result1.length()){
            System.out.println(result2);
        }else {
            System.out.println("Both have same length");
        }


    }
}



/*
2. write a program that asks user to enter two strings, and print out the longest string
 */