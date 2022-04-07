package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) { // while the age is invalid
                System.out.println("Invalid entry please re enter your age: ");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue? ");
            String a = scan.next().toLowerCase();

            while(!(a.equals("no") || (a.equals("yes") )) ){//while the age is invalid it will repeat over and over again
                System.out.println("Invalid Entry please re enter");
                a = scan.next().toLowerCase();
            }


            if (a.equals("no")) {
                break;
            }
        }
        scan.close();


    }
}
