package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,65};
        int [] reverse =reverseArray(arr1);
        System.out.println(Arrays.toString(reverse));



    }

    public static int[] reverseArray(int[] array) {

        int[] result = new int[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;


    }


}
