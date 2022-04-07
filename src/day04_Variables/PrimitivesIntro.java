package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
 //age:38 years old

        byte age = 38;
        System.out.println("age = " + age);

 //weight: 160 pounds

        //byte weight =160;
        //160 is out of byte range.

        short weight =160; //160 is within the range of short
        System.out.println("weight = " + weight);
 //salary:100000 $
        //short salary = 100000; //100000 is out of the short range
        int salary = 100_000; //int is the preferred data type for integer numbers
        System.out.println("salary = " + salary);
      long asset = 333333333333L;  //if it is outside int primitive L/l is a must.
        System.out.println("asset = " + asset);
// tax: 0.26
        float tax= 0.26f;
        System.out.println("tax = " + tax);
        double PI = 3.14; //Preferred decimal primitive data type
         //double > float > long > int > short >byte
        System.out.println("PI = " + PI);

       char ch2= 35;  //to print a single character we use char
        System.out.println("ch2 = " + ch2);

        char gender= 'F';
        System.out.println("gender = " + gender);

        char grade= 'B';
        System.out.println("grade = " + grade);

        char yesNo= 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployee= true; // either true or false.
        boolean isMarried= true;

        boolean result = 400 > 300; //on true statements boolean can be used.
        System.out.println("isEmployee = " + isEmployee);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

       //We will use string to print more than one character and one character will be char primitive.

       String name= "wooden spoon";
        String city= "Mclean ";
        String state= "Virginia";
        String country= "USA";

        System.out.println("country = " + country);
        System.out.println("state = " + state);
        System.out.println("city = " + city);
        System.out.println("name = " + name);


        //Variables names should be readable.
        //use camel case when more than one word.
        // NO spaces in variable names, can only use underscore and dollar sign.
        //use lower cases in variable names always.
        // Variable names can only be used once.
        // variables can not start with digits.
        //must be unique.
        //can not be Java reserved words.

/*
int: for integers
double: for decimals
char: for single characters
boolean: true/false
 */





    }




}
