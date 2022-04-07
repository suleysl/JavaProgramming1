package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise1 {
    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "United Kingdom", "Canada"};

        // converting array to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);

        //converting array list to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries)); // will be removed if bigger or equal to 10












    }
}
