package day24_CustomMethod_return;

public class ReturnMethodPractise4 {


    public static void main(String[] args) {


    String str = "cccccddddeeeeefffg";

    str= removeDuplicates(str);

        System.out.println(str);



    }

public static String removeDuplicates(String str) { //"aaabbcc"

        String result = " ";

    for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);

        if(!result.contains("" + each)){
            result  += each;
        }
    }

    return result;


}


}

