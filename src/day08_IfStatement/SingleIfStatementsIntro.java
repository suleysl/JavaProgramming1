package day08_IfStatement;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {


        int number = 101;


        /* System.out.println(" Odd number");

        System.out.println("even number"); */

        boolean evenNumber = number%2 == 0;

        if(evenNumber) {
            System.out.println( number + " is even number");
        }

        if(!evenNumber) {
            System.out.println( number + " is odd number");
        }

        int n = 200;
        //positive
        if(n >0) { // if the n is greater than zero it will be positive.
            System.out.println( n + " is positive number");
        }
        // negative
        if( n < 0){   // if the n is less than zero its negative.
            System.out.println(n + " is negative number");
        }

        //zero
        if( n == 0){
            System.out.println( n + " is zero");
        }

        /* if statements:
        single if: can be used creating condition for one possible outcome.
        if & else:


         */









    }
}
