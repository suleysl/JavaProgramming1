package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 5;

       String name = (n == 1) ? " January" : (n == 2) ? " February" : (n ==3 ) ? " March"
                : (n == 4) ? " April " : (n== 5 ) ? " May " : (n == 6) ? "June "
                : (n == 7) ? " July " : (n == 8) ? " august " : (n == 9) ? " September"
                : (n == 10) ? " October" : (n== 11) ? " november" : "December";

        System.out.println(name);






    }
}
