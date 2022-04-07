package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int maximumNumber= -2147483648; //any user entered number will be greater than -43958743587

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 numbers");
           int num= scan.nextInt();

           if(num > maximumNumber){ // if the user entered number is greater than current max number.
               maximumNumber= num;

           }

        }

        System.out.println("maximumNumber = " + maximumNumber);


    }
}
