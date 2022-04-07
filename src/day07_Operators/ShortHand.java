package day07_Operators;

public class ShortHand {
    public static void main(String[] args) {

        //assignment operator: = (update the data) 
        int number = 100;
        System.out.println("number = " + number); //100


        number = 200;

        System.out.println("number = " + number); //200 

        String word = "Java Programming";

        System.out.println("word = " + word);
        word = "wooden spoon";
        System.out.println("word = " + word); // wooden spoon 
        
        word = "cydeo";
        System.out.println("word = " + word);
        
       // word = 123; 
        word = "Java Programming";
        System.out.println("word = " + word);


        System.out.println("________________________________________");
        // addition assignmnet

        int x = 100;
        System.out.println("x = " + x);
        System.out.println( x + 200); //300

       // x = x +200;
        x += 200;
        System.out.println(" x = " + x);

        String str = "wooden";
        str += " spoon";

        System.out.println("str = " + str);
        
        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5 
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        availableBalance += 300; 
        System.out.println("availableBalance = " + availableBalance);
        //deposit 300$

        System.out.println("______________________________________");
        
        //withdrawing 500$ 
        
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$ then depositing 400$

        availableBalance -= 200;
        availableBalance += 400;

        System.out.println("availableBalance = " + availableBalance);

         double salary = 500000.50;
        System.out.println("salary = " + salary);
         salary *= 2;

        System.out.println("salary = " + salary);
        
        double dodge = 0.000000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("______________________________");

        double num2 = 2500.0;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("_____________________________");

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("___________________________________");

        int amount = 127;

        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("_____________________________________");

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);






























        
        
        

    }
}
