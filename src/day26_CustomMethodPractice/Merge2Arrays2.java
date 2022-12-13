package day26_CustomMethodPractice;

import utilities.ArrayUtility;

public class Merge2Arrays2 {

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] result = {};
        for (int each : array1) {
           result= ArrayUtility.addElement(result,each);
        }
        for (int each : array2) {
            result= ArrayUtility.addElement(result,each);
        }
        return result;
    }






}
