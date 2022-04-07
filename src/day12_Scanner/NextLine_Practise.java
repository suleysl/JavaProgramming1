package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practise {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int age = scan.nextInt();

       scan.nextLine();

        System.out.println("Enter your full name: ");

        String fullname= scan.nextLine();

        System.out.println("Enter GPA: ");
        double gpa= scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter School Name: ");
        String schoolName= scan.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);


    }
}
/*
1. ask user to enter age
2. ask user to enter full name

 */