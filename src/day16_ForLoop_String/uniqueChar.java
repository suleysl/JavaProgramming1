package day16_ForLoop_String;

public class uniqueChar {
    public static void main(String[] args) {


        String str = "aaabccc";
        //            0123456

        String result = ""; //"b"

        for(int i = 0; i < str.length(); i++){ //i: index numbers of str (starting from 0)

            char ch = str.charAt(i); //ch: each characters of str

            if(str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same, then the character is unique
                result += ch;
            }

        }


        System.out.println(result);




    }

}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

 */



