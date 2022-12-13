package day24_CustomMethod_Return;

import java.util.Arrays;

public class LiveClass {

    public static void main(String[] args) {

/*
2- Move All Zeroes To The End
   //Input: arr[] = {2, 3, 0, 0, 5, 0, 8}
   //Output = [2, 3, 5, 8, 0, 0, 0]
 */

        int[] array = {2, 3, 0, 0, 5, 0, 8};

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0 ) {
                result[j++] = array[i];
            }

        }

        System.out.println(Arrays.toString(result));





    }
}
