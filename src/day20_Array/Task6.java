package day20_Array;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        /*
        Ex:
                array = {10, 0, 5, 0, 1, 0};
        output:
                {10, 5, 1, 0, 0, 0}
         */
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] zeroToLast= new int[array.length];

        int j=0;
        for (int i = 0; i < array.length; i++) {

           if (array[i]!=0){
               zeroToLast[j++]=array[i];

           }




        }

        System.out.println(Arrays.toString(zeroToLast));




    }
}
