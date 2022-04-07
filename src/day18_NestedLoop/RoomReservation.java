package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int total = 0;

        while(true) {

        System.out.println("Which room would you like to reserve? ");
            System.out.println("  King bed == $120.");
            System.out.println("  Queen bed == $100.");
            System.out.println("  Single bed == $80.");

            String word = scan.nextLine().toLowerCase();

            while(! (word.equals("King bed") || word.equals("Queen bed") || word.equals("Single bed"))){
                System.out.println("Invalid entry, try again");
                word= scan.nextLine().toLowerCase();
            }
          total += (word.equals("King bed")? 120 : (word.equals("Queen bed")) ? 100:80);

            System.out.println("Would you like to select another room? ");
            String a = scan.nextLine().toLowerCase();

            while(!(a.equals("yes") || (a.equals("no") ) ) ){
                System.out.println("Invalid entry, please try again");
                System.out.println("Would you like to select another room? ");
                a= scan.nextLine().toLowerCase();
            } // it will stop if the answer is either yes or no

                 if (a.equals("no")){
                     System.out.println("Your total price is: $"+total);
                 }
                 scan.close();
        }
    }
}

