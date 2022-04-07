package day13_StringClass;

public class PractiseTask1 {

    public static void main(String[] args) {

        String word = "dance";
        //             01234
        char firstChar = word.charAt(0), //returns the character of the given index.
                lastChar= word.charAt(word.length()-1 ); // length: return the total number of chars- returns int.

        if(firstChar == lastChar){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }


    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */