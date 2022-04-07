package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtility2 {

    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "David" , "James" , "Daniel"};
        String [] earlyBirds= Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("__________________________________");

        char [] ch1 = {'A', 'B', 'C' , 'E' , 'F', 'G' , 'H' , 'I'};
        char [] ch2 = Arrays.copyOfRange(ch1, 2,6+1);

        System.out.println(Arrays.toString(ch2));

        int [] scores= {10, 20, 30, 40 , 50 , 60 , 70, 80 , 90 , 100};
        int [] result= Arrays.copyOfRange(scores, 3, 7+1);

        System.out.println(Arrays.toString(result));






    }
}
