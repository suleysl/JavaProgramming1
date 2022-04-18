package day41_Exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("test started");

        try {

            System.out.println(9 / 0);
        } catch (ArithmeticException e){

            System.out.println("Arithmetic exception was occurred");
        }

        System.out.println("test completed");


        System.out.println("test 2 started");

        int[] numbers = {1,2,3,4,5};


try {
    System.out.println(numbers[200]);

    System.out.println("Try block");

}catch (ArrayIndexOutOfBoundsException a){

    // a.printStackTrace();  // to get the full report of the exception occurred

    System.out.println(a.getMessage()); // other method to get less details about the exception


}


        System.out.println("test 2 completed");

    }
}
