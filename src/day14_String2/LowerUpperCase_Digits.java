package day14_String2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LowerUpperCase_Digits {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word= scan.next();

        char firstchar= word.charAt(0);


        if(firstchar >= 0 && firstchar <=9){
            System.out.println("First character is a digit.");
        }else if(firstchar >= 'A' && firstchar <= 'Z'){
            System.out.println("First character is an uppercase. ");
        }else if ( firstchar >= 'a' && firstchar <= 'z'){
            System.out.println("First character is a lowercase. ");
        }else {
            System.out.println("First character is a special character. ");
        }

    }
}
/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
 */