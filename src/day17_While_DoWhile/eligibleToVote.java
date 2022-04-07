package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class eligibleToVote {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        while( !(age >=1 && age <= 120)){
            System.err.println("Invalid entry, re-enter your age: ");
            age = scan.nextInt();
        }

        System.out.println(" Are you a US Citizen ? yes/no");
        String answer = scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter your citizen: ");
            answer = scan.next().toLowerCase();
        }

        if( age >=18 && answer.equals("yes")){
            System.out.println("You are eligible to vote! ");
        }else {
            System.out.println("Not eligible to vote! ");
        }


    }
}
