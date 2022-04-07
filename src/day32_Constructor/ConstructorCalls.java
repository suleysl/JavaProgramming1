package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
       this();
        System.out.println("Constructor int argument");
        // this(): has to be at the first step

    }

    public ConstructorCalls(String str){
        this(10);
        // this(10); can only call one constructor at a time not more
        System.out.println("Constructor with String argument");
    }


}
