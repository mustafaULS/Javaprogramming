package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"mustafa", "ulusoy", "sude", "koksal"};
        String[] group2 = {"sadam", "kurt", "wtf", "hello"};
        String[] group3 = {"cydeo", "java", "python", "abcabc"};

        String[][] groups = new String[3][];  // index number  0 ,1 ,2 also starts from 0 .
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //System.out.println(Arrays.toString(group1));     // to string to  for single array.
        System.out.println(Arrays.deepToString(groups)); // deep string to for dimensional array


        System.out.println("---------------------------------------------------------------");

        //idex of element: 0 1 2    0 1 2      0 1 2 3 4
        int[][] arr2D =  {{1,2,3}, {2,3,4,5}, {5,6,7,8,9}};
        //index of arrays:  0         1           2

        System.out.println(Arrays.toString(arr2D[1]));// return array so use to string
        System.out.println(arr2D[2][4]);              // return int , so call directly.
        // first  [] for searching array
        // second [] for searching array's element .












    }
}
