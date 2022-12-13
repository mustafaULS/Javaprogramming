package day20_Array;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int [] reverseArray=new int[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            reverseArray[j]=array[i];


        }




        System.out.println(Arrays.toString(reverseArray));



    }
}
