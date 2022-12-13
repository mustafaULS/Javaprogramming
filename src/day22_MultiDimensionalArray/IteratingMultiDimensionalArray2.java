package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        /*
        for result 9 10 11 12 13
                   4 5 6 7 8
                   1 2 3
         */

        for (int i = arr2D.length - 1; i >= 0; i--) {     // i is 1d index number .start from 0 .
            for (int j = 0; j < arr2D[i].length; j++) {   // j is index of element stars from 0 .

                System.out.print(arr2D[i][j] + " ");


            }


            System.out.println(); // for result 9 10 11 12 13
                                                // 4 5 6 7 8
                                                 //1 2 3

        }
        System.out.println("---------------------------------------------------");

        /*
        result :   3 2 1
                   8 7 6 5 4
                   13 12 11 10 9
         */

        for (int i = 0; i < arr2D.length; i++) {   // in order from 0
                  //  arr2D[i]

            for (int j = arr2D[i].length - 1; j >= 0; j--) {  // this is reverse .

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();


        }


        System.out.println("---------------------------------------------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }










    }
}
