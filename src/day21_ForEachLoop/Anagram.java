package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "acdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);



        String sentence = "Wooden Spoon";

       String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("____________________________________");

        String email = "WoodenSpoon@cydeo.com";

        String [] arr= email.split("@");

        System.out.println(Arrays.toString(arr));


    }
}
