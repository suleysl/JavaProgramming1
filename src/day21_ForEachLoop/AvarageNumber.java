package day21_ForEachLoop;

public class AvarageNumber {

    public static void main(String[] args) {


        int [] numbers= {10,20,30,40,50};
        double sum = 0;

        for (int number : numbers) {
            sum+= number;

        }
        double average = sum/ numbers.length;

        System.out.println(average);

        }
    }

