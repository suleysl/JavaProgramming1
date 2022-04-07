package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >+, <, <=

        boolean result1 = 200 > 40;
        System.out.println("result1 = " + result1);
        
        boolean result2= 300 >= 150;
        System.out.println("result2 = " + result2);
        
        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);
        
        boolean result4 = 300 >= 500;
        System.out.println("result4 = " + result4); // bigger or equal

        boolean result5 = 100< 120;
        System.out.println("result5 = " + result5);
        
        boolean resul6 = 200 < 180;
        System.out.println("resul6 = " + resul6);
        
        boolean result7 = 120 <= 120;
        System.out.println("result7 = " + result7);
        
        boolean result8 = 150 <= 125;
        System.out.println("result8 = " + result8); //smaller or equal
        
        boolean result9 = 151 == 150;
        System.out.println("result9 = " + result9);
        
        int x =  100;
        int y = 200;
        boolean equal = x == y; // false 

        System.out.println("equal = " + equal);
        
        boolean result10 = "Muhtar" == "good guy";
        System.out.println("result10 = " + result10);

        boolean result11 = 'A' == 'a'; // equal to one and another
        System.out.println("result11 = " + result11);
        
        boolean result12 = 121 != 120; // not equal to eachother
        System.out.println("result12 = " + result12);
        
        
        boolean result13 = 100 != 200.5;
        System.out.println("result13 = " + result13); // not the same - true

        boolean result14 = "Java" != "break";
        System.out.println("result14 = " + result14);

        boolean result15 = 300 != 300; //false because they are same numbers
        System.out.println("result15 = " + result15);

        System.out.println("________________________________________");


        // operators + - / % need to know

        //unary operators ++ -- (post and pre implement and declement

        // shorthand operators = += -=

        //relational operators <= , < , > , >= , == , !=

        // && , || , !
        


        
        
        










    }
}
