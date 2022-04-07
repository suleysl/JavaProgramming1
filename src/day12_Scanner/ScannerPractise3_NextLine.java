package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");

       String fullName= scan.nextLine();

        System.out.println("Enter your programming Language: ");

       String programmingLanguage = scan.nextLine();

        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        scan.nextLine();//for enter

        System.out.println("Enter your school name: ");

        String schoolName = scan.nextLine();


        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);


     scan.close();














    }
}
