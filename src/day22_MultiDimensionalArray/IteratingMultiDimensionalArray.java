package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


        //index of element:  0  1  2    0  1  2  3    0  1   2  3    4
        int[][] arr2D =    {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        // index of array:     0            1               2

        for (int i = 0; i < arr2D.length; i++) {  // i : index number of single dimensional arrays.

            //System.out.println(Arrays.toString(arr2D[i]));   // each single array .

            for (int j = 0; j < arr2D[i].length; j++) {        // j : index number of element .

                System.out.println(arr2D[i][j]);               //     each single array's element.
            }





        }

    }
}
