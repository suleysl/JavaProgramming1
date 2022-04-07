package day09_IfStatements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write your number between 1-9");
        int num = input.nextInt();

        boolean one = num ==1,
                two = num ==2,
                three= num ==3,
                four= num ==4,
                five= num ==5,
                six= num ==6,
                seven= num ==7,
                eight= num ==8;

        if(num < 0 || num > 9){
            System.out.println("Your number is invalid");
        }else if(one){
            System.out.println("One");
        }else if(two){
            System.out.println("Two");
        }else if(three){
            System.out.println("Three");
        }else if(four){
            System.out.println("Four");
        }else if(five){
            System.out.println("Five");
        }else if (six){
            System.out.println("Six");
        }else if(seven){
            System.out.println("Seven");
        }else if(eight){
            System.out.println("Eight");
        }else{
            System.out.println("Nine");
        }


    }
}


/*
Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
 */