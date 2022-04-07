package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "Ahmed", "David", "Sule", "Fatih", "Omer"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        System.out.println("_________________________________________");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names));

        list.removeIf( p -> p.charAt(0) == 'M');

        System.out.println(list);

       names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
