package day40_FinalKeyword;

import day06_PrimitiveTypeCastings.BirthDay;
import jdk.swing.interop.SwingInterOpUtils;

public class FinalVariable {

    final String birthday;

    public FinalVariable(String birthday){
        this.birthday = birthday;
    }

    final static String name;
    static {
        name = "Batch eu8";
    }

    public static void main(String[] args) {

        final double pi = 3.14; // final value means no other value can be assigned


        final String name;
        name= "Sule"; // final value assigned is sule and can NOT be reassigned

        // name= "wooden spoon";
        System.out.println(name);

        FinalVariable obj = new FinalVariable("may/01");

        System.out.println(obj.birthday);

        System.out.println(FinalVariable.name);


    }
}
