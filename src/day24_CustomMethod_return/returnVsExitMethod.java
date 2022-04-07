package day24_CustomMethod_return;

public class returnVsExitMethod {

    public static void main(String[] args) {

        nameOfMonth(50);

    }

    public static void nameOfMonth(int number) {

        if (number < 1 || number > 12) { // if number is invalid

            System.out.println("Invalid");

            return; // exits the nameofmonth method
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                : (number == 9) ? "Sept" : (number == 10) ? "October" : (number == 11) ? "Nov" : "Dec";


        System.out.println("Month name = " + name);

    }
}
