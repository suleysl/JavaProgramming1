package day13_StringClass;

import java.util.Scanner;

public class EnterAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word: ");
        String str = scan.nextLine();

        int length = str.length();
        String result = " ";

scan.close();


        if(length == 0 ){ // if string is empty give zero
            result = "empty";
        }else if (length > 3 ){ //to show that the word is more than 3 letters
            int lastIndex = str.length()-1;
            result = ""+ str.charAt(length -3 )+ str.charAt(length -2 )+ str.charAt(length -1); // to find out last 3 digits of the word.
        }else {
            result= str;
        }
        System.out.println(result);
    }
}
