package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 8 ;

        switch (number){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;  // exits the switch after executing thecase block

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");

            default: // only gets executed if non of the blocks are matching
                System.out.println("Invalid Number");
        }












    }
}
