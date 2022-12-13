package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElement1 {

    public static void main(String[] args) {

        int [] arr ={100,200,300,400,500,600};
        arr=removeElement(arr,3);
        System.out.println(Arrays.toString(arr));


    }

    // removes the index of array return new array.
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];

        int j = 0;          // represent result index number
        for (int i=0; i <array.length;i++) {  // i : array's index number .
            if (i==index) {   // if the index of array is matching with the given index.
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    // removes the index of array return new array.
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];

        int j = 0;          // represent result index number
        for (int i=0; i <array.length;i++) {  // i : array's index number .
            if (i==index) {   // if the index of array is matching with the given index.
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    // removes the index of array return new array.
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];

        int j = 0;          // represent result index number
        for (int i=0; i <array.length;i++) {  // i : array's index number .
            if (i==index) {   // if the index of array is matching with the given index.
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    // removes the index of array return new array.
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];

        int j = 0;          // represent result index number
        for (int i=0; i <array.length;i++) {  // i : array's index number .
            if (i==index) {   // if the index of array is matching with the given index.
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;

    }









}
