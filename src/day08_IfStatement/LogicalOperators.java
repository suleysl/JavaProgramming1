package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Aaron";

        int age = 18;

        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                      19>= 18 && "UK" == "usa"
        //                       true   &&  false  ===> false

        System.out.println( name + " is eligible to vote: " + isEligible );

        System.out.println("_________________________");

        String name2 = "Josh";

        int creditScore = 720;

        int age2 = 42;

        int income= 60001;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2 );

        System.out.println("______________________________________________________");

        String name3 = "Shay";

        int age3 = 21;

        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println( name3 + " is eligible to register:" + isEligible3);

        System.out.println("_________________________________________________________");

        String name4 = "James";

        String countryOfBirth= "USA";

        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println( name4 + " is eligible to apply for US CitizenShip: " + isEligible4);

        System.out.println("______________________________________________________");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("_________________________________________________________");

        int score = 55;
        boolean passed= score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);






















    }
}
