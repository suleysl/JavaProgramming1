package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal: ");

   double num1=  input.nextDouble();
        System.out.println(num1);


        System.out.println("enter an integer: ");
        int num2 = input.nextInt();
        System.out.println(num2);

        System.out.println("multiplication: " + (num1*num2));

        input. close(); // closes the scanner for the performance of the code. after this scanner can  not be used anymore.





    }
}

