package day13_StringClass;

import java.util.Scanner;

public class checkWords {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        System.out.println("Enter your third word ");
        String word3 = scan.next();

        scan.close();

        String result = "";

        if (word1.length() == word2.length() && word2.length() == word3.length()) {
            System.out.println("All words are same length");
        } else if (word1.length() == word2.length()) {
            System.out.println("Not same nor different lengths ");
        } else if (word1.length() == word3.length()) {
            System.out.println("Not same nor different lengths");
        } else if (word2.length() == word3.length()) {
            System.out.println("not same nor different lengths");
        } else {
            result = "All different length";
        }
    }
}


/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */