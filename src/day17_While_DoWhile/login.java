package day17_While_DoWhile;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        //username : "cydeo"
        //password : "cydeo123"


        Scanner scan = new Scanner(System.in);



        System.out.println("Enter your username: ");
        String u = scan.next();

        System.out.println("Enter your password: ");
        String p = scan.next();

        if ( u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attempts = 3;
            while( !(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts >0) { // while the credentials are invalid and user has attempts
               if(attempts == 1){
                   System.out.println("THIS IS YOUR LAST TRY");
               }
                System.out.println("Incorrect username Or password, please try again");
                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password: ");
                p = scan.next();
                attempts--;
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked. ");
            }
        }
scan.close();

    }
}
