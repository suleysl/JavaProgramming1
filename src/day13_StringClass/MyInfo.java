package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Enter your full name: ");

        String fullName= scan.nextLine();

        System.out.println("2. Enter your age: ");

        int age= scan.nextInt();

        scan.nextLine();

        System.out.println("3. Enter your gender: ");

        String gender= scan.next();

        scan.nextLine();

        System.out.println("4. Enter your phone number: ");

        long phoneNumber= scan.nextLong();

        scan.nextLine();

        System.out.println("5.Enter your building number: ");
        int buildingNumber= scan.nextInt();
       scan.nextLine();
        System.out.println("6. Enter your street name: ");
       String streetName= scan.nextLine();
        System.out.println("7. Enter your city name: ");
       String cityName= scan.nextLine();
        System.out.println("Enter your zipcode: ");
       int zipCode= scan.nextInt();

        System.out.println("6. Enter school name: ");

        String schoolName= scan.nextLine();

        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t " + buildingNumber + "  " + streetName + "\n\t" + cityName + " , " + zipCode );
        System.out.println("schoolName = " + schoolName);

    }
}
