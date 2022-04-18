package day41_Exceptions;

import day30_CustomClass.Student;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class CheckedVsUnchecked {

    public static void main(String[] args) {

               // unchecked

            int a = 10;
            int b = 0;

       // System.out.println(a/b);


        char [] characters = {'A', 'B', 'C'};

        // System.out.println(characters[99]);

        Student student = null;

        //System.out.println(student.getClass());

        String str = "wooden spoon";
        str= null;

        // System.out.println(str.toUpperCase());

              // Checked Exception

        System.out.println("hello");

       //  Thread.sleep(30);

        System.out.println("cydeo");






    }
}
