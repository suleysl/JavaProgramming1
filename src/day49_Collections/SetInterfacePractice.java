package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args){

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(hashSet);// is the fastest

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(30,50,70,453,35,5));
        System.out.println(linkedHashSet); // keeps the insertion order


        Set<Integer> treeSet= new TreeSet<>();

        treeSet.addAll(Arrays.asList(30,56,23,12,67));
        System.out.println(treeSet); // does not accept null. Keeps sorted order






    }
}
