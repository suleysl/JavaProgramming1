package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList<String > list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Lemon");
        list.add("Strawberry");
        list.add("Lemon");
        list.add("Lemon");
        list.add("Apple");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for( String each : list){
            if( list.indexOf(each) == list.lastIndexOf(each)){
                System.out.println(each);
            }
        }
    }
}
