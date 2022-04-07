package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 30,
                b= 50,
                c= 15;


        /*
        if we have three diffrenet numbers one Must Be maximum and one must be median and minimum.
         */

        boolean aIsMedian = (a > b && a < c) || ( a > c && a < b);

        boolean bIsTheMedian = ( b > c && b < a)  ||  ( b > a && b < c );

        boolean cIsTheMedian = !aIsMedian && !bIsTheMedian;

        if(aIsMedian){ //if a is the median number
            System.out.println(a + " is median number");
        }

        if(bIsTheMedian){  // if b is the median number
            System.out.println(b + " is the median number");
        }

        if(cIsTheMedian){ // if c is the median number
            System.out.println(c + " is the median number");
        }

        /* in order for a to be the median number:
                         1: if c is the maximum number & b is the minimum number , then a is the median number.
                         2: if b is the maximum number & c is the minimum number , then a is the median number.

         */
    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number

 */