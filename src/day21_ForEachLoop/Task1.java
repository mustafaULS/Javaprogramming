package day21_ForEachLoop;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
       /* 1. Write a program that sort the array of integer in descending
                order



        */

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = new int[a.length];

        int j=0;
        for (int i = a.length - 1; i >= 0; i--) {
               b[j++]  = a[i];

        }
        System.out.println(Arrays.toString(b));



/*

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j =0; i >=0 ; i--,j++) {
            result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));

 */





    }
}
/*
1. Write a program that sort the array of integer in descending
order
 */