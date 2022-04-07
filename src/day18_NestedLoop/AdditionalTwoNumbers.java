package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number ");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue? ");


            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || (a.equals("no") ))){
                System.out.println("Invalid entry please re enter. ");
                a = scan.next().toLowerCase();
            }
            if(a.equals("no")){
                break;
            }

        }
        scan.close();
    }
}