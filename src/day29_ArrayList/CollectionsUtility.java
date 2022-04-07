package day29_ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>() ;
      list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("___________________________________");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2);

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("____________________________________");

        ArrayList<Integer> list3 = new ArrayList<>() ;
        list3.addAll(Arrays.asList(10,20,30,40,50,50,50,60,70,80,90,90,90));
        Collections.swap(list3, 1,5);

        System.out.println(list3);

        System.out.println("____________________________________");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        Collections.replaceAll(list3 , 50, 80);

        System.out.println(list3);

        int frequency= Collections.frequency(list3, 90);

        System.out.println("frequency = " + frequency);


    }
}
