package day19_LoopsPractise;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "" ;


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a is assigned
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each = str.charAt(i); //each characters of str
                if (ch == each) {
                    count++;
                }
            }

            if(result.contains(""+ ch)){
                continue;
            }
            result+= ch;
            result+=count;

        }


        System.out.println(result);
















    }
}
