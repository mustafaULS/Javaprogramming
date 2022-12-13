package day27_WrapperClasses;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8};
       array= swap(array,2,4);
        System.out.println(Arrays.toString(array));
    }


    //{1,2,3,4,5,6,7,8}
    public static int[] swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i] = array[j];
        array[j]=temp;


        return array;

    }
}
/*
2. Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40,
30}
 */
