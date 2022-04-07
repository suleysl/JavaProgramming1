package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        /*System.out.println( true == !false); //true
        System.out.println( !true != false);  //false
        System.out.println( !false == true);//true

        System.out.println( !!false); //false
        System.out.println( !!!true ); //false

         */

        int score = 85;

        boolean a = score >= 90 && score <= 100; // false
        boolean b = score >=80 && score <=89; // true
        // boolean b = score >= 80 && !a; // if score is not a, but greater than 80.
        boolean c = score >= 70 && score <= 79;
        // boolean c = !a && !b && score >= 70. // another way of printing that student did not get a or b.
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        //boolean f = !a && !b && !c && !d

        if(a){ // if the student made an A
            System.out.println( " excellent ");
        }


       if (b) {
           System.out.println( " Great ");
       }

       if (c) {
           System.out.println( " Good ");
       }

        if (d) {
            System.out.println("passed");
        }

        if (f) {
            System.out.println( " failed ");
        }







    }
}
/*
score
90 - 100 ==> excellent
80 - 89 ==> Great
70 - 79 ==> good
60 - 69 ==> passed
0 - 59 ==> failed

 */