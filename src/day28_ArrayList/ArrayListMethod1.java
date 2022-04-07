package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);// autoboxing is done here //0
        numbers.add(10); //1
        numbers.add(15); //2
        numbers.add(20);//3
        numbers.add(25);//4
        numbers.add(30);//5

        numbers.add(2, 13);
        System.out.println(numbers);

        System.out.println(numbers.size() );

        int lastIndex= numbers.size() -1;

        System.out.println("lastIndex = " + lastIndex);

      Integer num=  numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("--------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Pyhton");
        list.add("CsHARP");
        list.add("Ruby");
        list.add("Java");

        list.set(4 , "Java Script");

        System.out.println(list);



    }
}
