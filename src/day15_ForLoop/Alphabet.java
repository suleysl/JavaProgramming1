package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

//A-Z ==> 65 TO 90

        for(int i = 65; i <=90; i++){
            System.out.print((char)i + " ");
        }

        System.out.println();

        System.out.println("_______________________________");

        for(char i = 'A'; i <= 'Z'; i++){  //i: A,B,C,D,E,F,G,H,I,....
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("___________________________________");

        //a-z

        for(char i = 'a'; i <= 'z'; i ++){
            System.out.print(i + "  ");
        }
        System.out.println();

        //Z-A


        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        // z-a

        for(char i= 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("___________________________");

       /* for(char i =1; i <= 40000; i++){
            System.out.print(i + "  ");
        }
         */




    }
}
