package day14_String2;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word= scan.next();

        char firstChar= word.charAt(0);
        String result= " ";

        if(firstChar >= '0' && firstChar<= '9' ){ // if it is between 0-9 is a digit
            result= "first character is a digit";

        }else if(firstChar >= 'a' && firstChar <= 'z'){ //lower a-z is a lowercase
            result= "first character is a lowercase letter";
        }else if (firstChar>= 'A' && firstChar<= 'Z'){ //capital A-Z is a capital case
            result= "first character is uppercase letter";
        }else {
            result= "first character is a special character"; // if non of the above than special character.
        }
        System.out.println(result);

        scan.close();
    }
}
