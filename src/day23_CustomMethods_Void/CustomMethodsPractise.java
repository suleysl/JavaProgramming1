package day23_CustomMethods_Void;

import day02_HelloWorld.HelloCydeo;

public class CustomMethodsPractise {

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("________________________________________________");
        helloCydeo5Times();
        System.out.println("_________________________________________________");
        evenNumbers1to10();

    }

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

    public static void evenNumbers1to10(){

        for (int i = 2; i < 11; i+=2 ) {
            System.out.println(i);
        }
    }



}

