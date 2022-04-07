package day13_StringClass;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethods {
    public static void main(String[] args) {

        String str= "   "; //if there is a space that means the result will be false

       boolean r=  str.isEmpty(); //returns boolean true or false, if the string is empty it will return false.

        System.out.println(r);


        System.out.println("__________________________________");


      boolean r1= str.isBlank(); // not used white space means blank and it will return us true if the string is blank.

        System.out.println(r1);

        System.out.println("___________________________-");

        String str2= "Cydeo";

        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());

        System.out.println("__________________________________");

          String s1= "CYDEO";
          String s2= "cydeo";

        System.out.println(s1.equals(s2)); // it will not ignore the case sensitivity and will return false
        System.out.println(s1.equalsIgnoreCase(s2)); //it will ignore the upper and lower cases and will print true.

        System.out.println("____________________________________");

        String sentence= "My favorite programming LANGUAGE IS Java";
       boolean hasCSharp= sentence.contains("CSharp"); //if it does not contain the word it will return false.
        System.out.println(hasCSharp);
boolean hasJava= sentence.contains("Java"); //
        System.out.println(hasJava); // will return true if the sentence contains the word.
boolean hasJava2= sentence.toLowerCase().contains("java");
        System.out.println(hasJava2); // contains method is case sensitive when ignoring this assigning to tolowercase will solve it.


        System.out.println("_______________________________");

        String input1= "I love JAvA";
        String input2= "Java";

        boolean result= input1.equals(input2);
        boolean result2= input1.contains("Java");

        System.out.println(input1.equalsIgnoreCase(input2));  //false

        System.out.println("result2 = " + result2);  //true
        System.out.println("result = " + result);  //false

        System.out.println(input1.toLowerCase().contains("java"));   //TRUE
        System.out.println(input1.toUpperCase().contains("JAVA"));  //TRUE


        System.out.println("_________________________________");

        String a= "Wooden Spoon";
         boolean result3 = a.startsWith("Woo");
         boolean result4= a.endsWith("Spoon");
        System.out.println(result3); // checks starting from index zero it does not match it will return false.
        System.out.println(result4); //true. it matches the ending of the string.







    }
}
