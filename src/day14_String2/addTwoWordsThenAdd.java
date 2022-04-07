package day14_String2;

import java.util.Scanner;

public class addTwoWordsThenAdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        String word1 = scan.next();

        System.out.println("Enter your second word: ");
        String word2 = scan.next();

        scan.close();

        String result = " ";

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            result = word1 + word2.substring(1);
        } else {
            result = word1 + word2;
        }
        System.out.println(result);

    }
}

/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */