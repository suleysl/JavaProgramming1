package day22_MultiDimensionalArray;

public class IteratingMultidimensionalArrays2 {

    public static void main(String[] args) {

        int arr2D [][] = {{1,2,3} , {4,5,6,7,8} , {9,10,11,12,13} };


        for (int i = arr2D.length - 1; i >= 0; i--) { // i : index number of one dimensional array from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) { //j: index number of the elements starting from the index 0
                System.out.print(arr2D[i] [j] + " ");
            }

            System.out.println();

        }

        System.out.println("_____________________________________");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i] [j] + " ");

            }

            System.out.println();

        }

















    }
}
