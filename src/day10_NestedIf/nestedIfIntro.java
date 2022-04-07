package day10_NestedIf;

public class nestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <= 100) { //if score is valid
            if (score >= 60) {
                System.out.println(" Passed "); // if student passed the exam
            } else {
                System.out.println("Failed");
            } // if student failed the exam
        } else { // if the score is invalid
            System.out.println("Invalid Score");

        }

        System.out.println("____________________________________");

        int age = 25;
        boolean hasId = true;

        if(hasId){ //if the person has ID
            if (age >= 21){ // If the person is 21 year old or over
                System.out.println("Eligible to buy alcohol");
            } else { //if the person is less than 21 years old.
                System.out.println(" Not eligible to buy alcohol");
            }
        } else { // if the person does not have ID
            System.out.println( " You must have ID to buy alcohol");
        }

        System.out.println("___________________________________________");

        int number = 7;

         if (number >= 1 && number <= 7){ // if the number is a valid number (1-7)
             if (number == 1){
                 System.out.println("Monday");
             }else if (number ==2){
                 System.out.println("Tuesday");
             }else if( number== 3){
                 System.out.println("Wednesday");
             }else if ( number ==4){
                 System.out.println("Thursday");
             }else if ( number == 5){
                 System.out.println("friday");
             }else if ( number == 6){
                 System.out.println("Saturday");
             }else {
                 System.out.println("Sunday");
             }

         } else { // if the number is not valid
             System.out.println("invalid number");
         }












    }
}





