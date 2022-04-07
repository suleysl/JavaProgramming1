package day29_ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,4,8));

        System.out.println(list);

        System.out.println("___________________________________________________________");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300)); // will keep the wanted numbers and remove others that are not matching

        System.out.println(numbers);

        System.out.println("_____________________________________________________________");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer" , " QA" , "Scrum Master", "SDET"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("________________________________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //boolean r1 = nums.contains(10);

        //System.out.println("r1 = " + r1);

        boolean r2 = nums.containsAll(Arrays.asList(5,8,1,10));

        System.out.println("r2 = " + r2);

        System.out.println("__________________________________________________________");

        String[] names = {"Josh", "Jack", "Fatih","Gulo"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

         */

        System.out.println(namesList);











    }
}
