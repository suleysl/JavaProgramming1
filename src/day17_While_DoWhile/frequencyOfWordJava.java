package day17_While_DoWhile;

public class frequencyOfWordJava {

    public static void main(String[] args) {

        String sentence = "JavaJavaJavaJavaJava";

        int frequency = 0;

        for (int i = 0; i < sentence.length() -3 ; i++) { // i can be 7.
           String eachSubstring= sentence.substring(i, i +4 );
           // System.out.println(eachSubstring);

         if(eachSubstring.equals("Java")){
             frequency++;
         }


        }

        System.out.println(frequency);



    }
}
