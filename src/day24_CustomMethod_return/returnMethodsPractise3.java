package day24_CustomMethod_return;

public class returnMethodsPractise3 {

    public static void main(String[] args) {

     String str= "aabccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequencyNumber = frequencyNumber(str,str.charAt(i));

            if(frequencyNumber == 1){
                System.out.println(str.charAt(i));
            }
        }






    }

    public static int frequencyNumber(String str, char ch){
         int count = 0;

       for(char each : str.toCharArray() ){

           if(each == ch){

               count++;
           }
       }

       return count;

    }










}
