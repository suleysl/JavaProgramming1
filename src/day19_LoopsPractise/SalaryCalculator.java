package day19_LoopsPractise;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your hourly rate:");
            int hourlyRate = scan.nextInt();

            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work in a week?");
            int weeklyHours = scan.nextInt();

            if (weeklyHours <= 0) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate:");
            double stateTaxRate = scan.nextDouble();

            if (stateTaxRate <= 0 || stateTaxRate > 0.1) {
                System.err.println("Invalid Entry for state tax rate");
                System.exit(0);
            }
        }
    }
}