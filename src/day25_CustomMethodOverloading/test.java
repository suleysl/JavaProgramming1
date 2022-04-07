package day25_CustomMethodOverloading;

import utilities.StringUtility;

public class test {

    public static void main(String[] args) {


        String str = "JAVA PROGRAMMING LANGUAGE";

        StringUtility.printEachChar(str);


        String str2 = "Wooden Spoon";
       String reverse= StringUtility.reverse(str2);

        System.out.println(reverse);

        String word= "civic";

        boolean palindrome= StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count= 0;

        for(String each: names){
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        String s2= "aaaaaabbbcddgtdddfdd";
        String nonDup= StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);


    }

}