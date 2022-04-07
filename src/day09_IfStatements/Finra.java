package day09_IfStatements;

public class Finra {

    public static void main(String[] args) {


        int n1 = 3;
        int n2 = 10;
        int n3 = 15;

        if (n1 % 3 == 0) {
            System.out.println("FIN");
        }
        if (n2 % 10 == 0) {
            System.out.println("RA");
        }
        if (n3 % 3 == 0 && n3 % 5 == 0) {
            System.out.println("FINRA");
        }

    }
}











/* Create a class called FINRA, Write a function which prints out the
number. but for number which is a multiple of 3, print "FIN" instead
of the number and for number which is a multiple of 5, print "RA"
instead of the number. and for number which is a multiple of both 3
and 5, print "FINRA" instead of the number.
ex:
number = 3
output:
FIN
number = 10
output:
RA
number = 15
output:
FINRA

 */