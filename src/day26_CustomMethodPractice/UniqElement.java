package day26_CustomMethodPractice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqElement {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,12,2,3,4,1,2,3,4,5,6,7,8,};

        int [] unique=uniqueElement(arr);
        System.out.println(Arrays.toString(unique));
    }

    // return the unique element of the array as a new array
    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1) {// if the frequency is 1, then element is unique.
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return the unique element of the array as a new array
    public static double[] uniqueElement(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1) {// if the frequency is 1, then element is unique.
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return the unique element of the array as a new array
    public static String[] uniqueElement(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1) {// if the frequency is 1, then element is unique.
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return the unique element of the array as a new array
    public static char[] uniqueElement(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1) {// if the frequency is 1, then element is unique.
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }



}
