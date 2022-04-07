package day27_WrapperClass;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str); //int

        System.out.println(num + 5);

        String str2= "10.5";

       double num2= Double.parseDouble(str2);

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max2= Long.MAX_VALUE;
        long min2= Long.MIN_VALUE;

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        String s1= "true";
       boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);

        String s2= "12345";
      Integer x= Integer.valueOf(s2); //integer
        int y = Integer.valueOf(s2);

        System.out.println(x);




        char ch1= '0';

        //isdigit()
        boolean r2 = Character.isDigit(ch1);

        // is letter
        boolean r3 = Character.isLetter(ch1);

        //special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        //UpperCase
        boolean r5= Character.isUpperCase(ch1);

        // LowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println("---------------------------------------------------");

        String s= "abc1de3fg5hyt6";

        int sum = 0;

        for(char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }

            System.out.println(sum);
        }













    }
}
