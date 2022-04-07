package day14_String2;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number : ");
        String accountNo = scan.next();

        scan.close();

        String result = "Invalid";

        if (accountNo.charAt(0) == '2') { // if index number is 2
            if (accountNo.length() == 7) {// length will be 7 characters long.
                result = "Valid";
            }
        } else if (accountNo.charAt(0) == '5' ) {
            if (accountNo.length() == 10) {
                result = "Valid";
            }
        }
        System.out.println(result);
    }
}
/*
 6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */