package day15_ForLoop;

public class formatFullName {

    public static void main(String[] args) {

        String firstName= "cyDeo",
                lastName= "sCHOOL";

       firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                 //C         +                       ydeo  ==>  "Cydeo"


        System.out.println(firstName);

       lastName= lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName= firstName+ " "+lastName;

        System.out.println("fullName = " + fullName);

    }
}
