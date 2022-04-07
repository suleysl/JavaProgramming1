package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf( p -> p <5); //lampda experssion

        System.out.println(list);


        System.out.println("________________________");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each -> each%2 ==0);

        System.out.println(list2);


        System.out.println("_____________________________");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Pencil", "Pen", "Rubber", "Sharpner"));

        list3.removeIf(p -> p.startsWith("P"));
        System.out.println(list3);

        System.out.println("______________________________");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Phython", "Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));

        System.out.println(names);

























    }
}
