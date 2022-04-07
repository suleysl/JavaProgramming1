package day19_LoopsPractise;

public class FindTheUniqueCharacter {

    public static void main(String[] args) {


        String str= "aabccdeef";
        String result= "";  //bdf


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count= 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {// compares the character that outer loop picked with each character of the str
                char each= str.charAt(i);// each character of the string
                if( ch== each){
                    count++;
                }

            }
            if( count == 1){ // if the frequency appears once that means its unique character
                result += ch;
            }

        }

        System.out.println(result);








    }
}
