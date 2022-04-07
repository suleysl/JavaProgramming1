package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void evenNumberOrOddNumber(int number){
        if(number %2 ==0 ){
            System.out.println("is even number = " + number);
        }else {
            System.out.println("is odd number = " + number);
        }
    }

    public static void main(String[] args) {
        evenNumberOrOddNumber(26);

        ageOfPerson(1994);
    }


    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;

        System.out.println("Your age is : " + age);
    }

    public static void printNumbers(int x, int y){

    }

}
