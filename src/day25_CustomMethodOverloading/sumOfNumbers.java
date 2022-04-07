package day25_CustomMethodOverloading;

public class sumOfNumbers {

    public static void main(String[] args) {

        int sum =  sumOfNumbers(10,20);

        System.out.println("sum = " + sum);

        int sum2= sumOf3Numbers(10,20,40);

        System.out.println("sum2 = " + sum2);

        int sum3= SumOf4Numbers(30,50,50,30);

        System.out.println("sum3 = " + sum3);

    }


    public static int sumOfNumbers(int num1 , int num2){
        return num1+num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;

    }

    public static int SumOf4Numbers(int num1, int num2, int num3,int num4 ){
        return num1+ num2+ num3+ num4;
    }


}
