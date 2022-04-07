package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        // ELIGIBLE OR NOT ELIGIBLE!

        boolean isEligible = age >= 21 && citizen == "USA";


        //ELIGIBLE

        if(isEligible){
            System.out.println("Eligible");
        }

        //Not Eligible

        if( !isEligible){
            System.out.println("Not Eligible");
        }







    }
}
