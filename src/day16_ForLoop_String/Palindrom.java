package day16_ForLoop_String;

public class Palindrom {

    public static void main(String[] args) {


        String str = "Java";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);

    }

}



/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */
