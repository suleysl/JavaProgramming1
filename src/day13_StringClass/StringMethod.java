package day13_StringClass;


public class StringMethod {

    public static void main(String[] args) {

        String word= "Cydeo";

        char thirdChar= word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        String word2= "School";

        char fourthChar= word2.charAt(3);

        System.out.println("fourthChar = " + fourthChar);

        System.out.println("___________________________________");

        String s1= "Batch 25 is the best batch";
       int totalChar= s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastchar= s1.charAt(totalChar-3);
        System.out.println("lastchar = " + lastchar);

        System.out.println("____________________________________");

        String str = "wooden spoon";
      str=  str.toUpperCase();// :WOODEN SPOON (NEW STRING OBJECT WILL BE CREATED)
        System.out.println("str = " + str);

        String s = "JAVA";
        s= s.toLowerCase();
        System.out.println("s = " + s);

        String sentence= "Today is a great day for java";
        sentence= sentence.toUpperCase();
        System.out.println("sentence = " + sentence);



    }
}
