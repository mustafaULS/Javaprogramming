package day26_CustomMethodPractice;

import utilities.ArrayUtility;

public class RemoveElement2 {


    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {    //i : array's index number .
            if (i != index) {  // if i not equals to the given index number then add rest of the element to new array
                result = ArrayUtility.addElement(result, array[i]);
            }
        }
        return result;

    }


}

