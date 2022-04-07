package day10_NestedIf;

public class TernariesInfo {

    public static void main(String[] args) {

       int n = 100;

       if (n%2 == 0){

           System.out.println("even");// string
       } else {
           System.out.println("odd"); //string
       }
        System.out.println("_____________________");

        String result1 = (n%2 == 0)?" even ": "odd";

        System.out.println(result1);

        System.out.println("________________________");


        int age = 17;
        /*
        if ( age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("not eligible");
        }

         */

       String result2 = (age >= 21)? "eligible" : " not eligible";
        System.out.println(result2);

        System.out.println("_______________________");

        int number = 100;

         /*
        if (number >0 ){
            System.out.println("positive");
        }else if (number < 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

          */
       String result3 = (number > 0)?  " positive " :(number < 0) ? "negative" : "zero";
        System.out.println(result3);


    }
}
