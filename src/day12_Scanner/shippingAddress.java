package day12_Scanner;

import java.util.Scanner;

public class shippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber= scan.next();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName= scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName= scan.nextLine();

        System.out.println("Enter your state: ");
        String state= scan.next();

        scan.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode= scan.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

scan.close();

    }
}




/*
1. enter your full name
2. enter your building number
3. enter your street name
4. enter your city name
5. enter your country
6. enter your zipcode

display the shipping address

 */