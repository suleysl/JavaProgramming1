package day12_Scanner;


//import java.util.*; //wild import: imports everything from the package

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7: ");

        int num = scan.nextInt();

        String result ;

        if(num >= 1 && num <= 7){

          result=   (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday" :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";

        }else {
            result = "INVALID NUMBER";
        }

        System.out.println(result);

       scan.close();



    }
}
