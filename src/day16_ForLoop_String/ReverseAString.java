package day16_ForLoop_String;

public class ReverseAString {

    public static void main(String[] args) {

        String str= "Wooden Spoon";
        //           012345678910
        String result= " "; //comtain the reverse version of this str
/*
        result += str.charAt(11 ); //n
        result += str.charAt(10);//no
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);

 */

        for (int i = str.length()-1; i >= 0; i--) { //i: index numbers of str starting from last index 0
            result += str.charAt(i);

        }

        System.out.println(result);


        }









    }

