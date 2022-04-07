package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");

    }

    static { // runs first before everything and runs one time
        System.out.println("Static Block");

    }
    static {
        System.out.println("Static Block2");

    }

    static {
        System.out.println("Static Block3");

    }



}
