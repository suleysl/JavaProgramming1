package day17_While_DoWhile;

import java.util.Scanner;

public class marriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me? Yes/no ");

        String answer= scan.next().toLowerCase();

        while( !(answer.equals("yes") || (answer.equals("no")))){
            System.err.println("Invalid answer, please re-enter ");
            answer= scan.next().toLowerCase();
        }


        if( answer.equals("yes")) {
            System.out.println("CONGRATS! ");
        }else {
            System.out.println("Good bye! ");
        }
scan.close();

    }
}