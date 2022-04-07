package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

public class BranchingStatements2 {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {

            if ( i == 'C'){
                continue; // it will skip the previous statement
            }
            System.out.println(i);

        }

        System.out.println("______________________________________________");

        for (int i = 1; i < 11; i++) {

            if(i%2 != 0){ //numbers that are not divisable will get executed
                continue; //skip
            }
            System.out.println(i);
        }














    }
}
