package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

/*
int score = 55;
        String result = "";

        if ( score >= 0 && score <= 100){ // 5 possibilities - if the score is valid
            if( score >= 90 ){
                result = " Excellent ";
            } else if  ( score >= 80){
                result = " Great ";
            } else if ( score >= 70 ){
                result =" Good ";
            }else if ( score >= 60){
                result = " Passed ";
            }else {
                result ="failed";
            }
        } else { // if the score is not valid - 1 possible output
            result =" Invalid score ";
        }
        System.out.println(result);
 */

        int s = 100;

       String result =  (s >= 0 && s <= 100)?  (s>=90)? "Excellent" : (s>=80) ? "Great"
                : (s>= 70) ? "good" : (s>=60) ? "Passed" : "Failed" : "invalid score";

        System.out.println(result);






    }
}
