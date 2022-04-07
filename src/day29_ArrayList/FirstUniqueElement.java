package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for(Integer each : list){

            int frequency = 0;

            for (Integer element : list) {
                if(element ==1){
                    frequency++;
                }
            }

            if(frequency ==1){
                System.out.println(each);
                break;
            }
        }

    }
}
