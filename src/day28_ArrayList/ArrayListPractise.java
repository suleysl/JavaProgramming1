package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractise {


    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) *2);
        }
        System.out.println(list);

        System.out.println("---------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("serife");
        employees.add("mustafa");
        employees.add("gulustan");
        employees.add("osman");
        employees.add("sule");
        employees.add("fatih");

        System.out.println(employees);

       employees.remove(3);

        System.out.println(employees);
       employees.remove(4);

        System.out.println(employees);
       employees.remove(3);
        System.out.println(employees);
       employees.remove(employees.size()-1 );

       employees.remove("serife");


        System.out.println(employees);

    }
}
