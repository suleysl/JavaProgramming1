package week06;

import java.util.Scanner;

public class counterNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int upperBound = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= upperBound ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        scan.close();
    }

}



/*Question-8:

 Write a program to calculate the sum of the numbers from 1 till upper bound.
 If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
 If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
 If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

 */