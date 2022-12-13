package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {


        int[] score = {12, 56, 89, 34, 90, 123, 678, 345, 5678,};

        //sort.
        Arrays.sort(score);//  smallest to the largest. in order ascending .
        System.out.println(Arrays.toString(score));

        System.out.println("min number = " + score[0]);// after sort  the index number 0 is smallest.
        System.out.println("max number = " + score[score.length-1]); // the last index number is greatest .


        String [] name = {"bilal","ahmet","abul","mustafa","sude","sadam",};
        Arrays.sort(name);                          //  is string also follow in alphabet orders.
        System.out.println(Arrays.toString(name));  // base on the ascii table.
        //ascending order,0-9,a-z,A-Z .

        System.out.println("==================================");
        // equals.
        // compare 2 arrays, return boolean,  true and false.

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,3,2,4};

        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1); // false    not the same

        System.out.println("==================================");

        Arrays.sort(arr1);  // after order
        Arrays.sort(arr2);
        boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2); // true  the same .

        System.out.println("==================================");

        /* anagram
        compare 2 string build by same characters
        first convert to the arrays  (not learn yet).
        then use arrays.sort to make it order
        then use arrays.equals to compare .
         */
        System.out.println("==================================");
        // copy of();
















    }
}
