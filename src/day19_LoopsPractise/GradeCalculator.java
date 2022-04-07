package day19_LoopsPractise;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score:");
            int score = scan.nextInt();

            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

            System.out.println("grade = " + grade);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo grade calculator app!");
                break;
            }

        }
    }
}
