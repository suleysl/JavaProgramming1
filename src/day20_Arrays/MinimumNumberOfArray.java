package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = { 5,7,8,3,6}; // assumes that first number is the minimum  number by default but it will be replaced once every number is checked

        int min = numbers[0]; //5

        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i] < min ){
                min = numbers[i];
            }

        }

        System.out.println(min);
    }
}
