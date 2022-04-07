package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        boolean positive = n > 0;
        boolean negative = n < 0;


        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else{
            System.out.println("zero");
        }
    }
}

