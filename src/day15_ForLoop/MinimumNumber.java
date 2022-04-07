package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int min = 214748647; // only number that user enter will be less than this number.

        for (int i = 10; i < 15; i++){
            System.out.println("Enter 5 numbers: ");
            int num = scan.nextInt();

            if( num < min){
                min = num;
            }

        }

        System.out.println("min = " + min);



    }
}
