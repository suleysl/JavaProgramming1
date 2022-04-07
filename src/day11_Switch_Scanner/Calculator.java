package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

      char operator = '/';
      double n1 = 200.5,
              n2 = 10.4;

      boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';


      if(valid){ // operator + - * /

          switch (operator) {
              case '+':
                  System.out.println(n1 + n2);
                  break;



              case '-' :
                  System.out.println(n1 - n2);
                  break;

              case '*' :
                  System.out.println(n1 * n2);
                  break;

              default:
                  System.out.println(n1/n2); }

      } else{
          System.err.println("Invalid");
      }





    }
}
