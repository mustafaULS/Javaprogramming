package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[arr1.length + arr2.length]; // make sure have capacity .

        int i = 0; // important.
        // create variable  because we have to assign the arr1 and arr2 numbers to the arr3's index number
        // which index number corresponding to which number .


        for (int each : arr1) {
            arr3[i++]=each;  // like =  [0]=1, then i++,  [1]=2 , i++ , [2]=3, i++ , [3]=4
            //post increment. i++ .

        }

        for (int each : arr2) {

            arr3[i++]=each;// [4]=5, i++ [5]=6
        }


        System.out.println(Arrays.toString(arr3));


        /*
        merge arrays
        first create size of array === total  = the array1 length + array2 length
        make sure total array have enough capacity.

        then create int , for corresponding total's index number .
        give every element of array1 and re-assign to array total.

         */




    }
}
