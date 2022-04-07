package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("enter a number");
            int number = scan.nextInt();

            if( number %2 == 0){
                System.out.println(number + "is even number. ");
            }else {
                System.out.println(number+ "is odd number. ");
            }

            System.out.println("would you like to enter a number");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes") || (a.equals("no") )) ){
                System.out.println("Invalid answer please re enter ");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
scan.close();


        }
    }
}
