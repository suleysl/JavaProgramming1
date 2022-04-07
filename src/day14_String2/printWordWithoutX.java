package day14_String2;

import java.util.Scanner;

public class printWordWithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word= scan.next();

        if(word.charAt(0) == 'x'){ // charat= gives the character of the index
            word= word.substring(1); //from the beginning index to the ending index
        }
        System.out.println(word);

        scan.close();
    }
}
