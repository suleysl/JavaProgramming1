package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

     /*
     90-100 : excellent
     80- 89 : great
     70-79: good
     60-69: passed
     0-59 : failed
      */

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

















    }
}
