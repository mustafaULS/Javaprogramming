package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] reverse = new int[numbers.length]; // set the number first . same length .make sure have enough capacity.
/*
        reverse[0] = numbers[numbers.length - 1];  // chose last index number of number to put in first index of reverse.

                j            i
        reverse[1] = numbers[3];
        reverse[2] = numbers[2];
        reverse[3] = numbers[1];
        reverse[4] = numbers[0];
        System.out.println(Arrays.toString(reverse));

 */
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            reverse[j] = numbers[i];
        }


    }
}
