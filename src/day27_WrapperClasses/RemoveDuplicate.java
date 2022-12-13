package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,4,5,6,7,7};
        arr=removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

                                            // {1,2,2,3,4}
    public static int [] removeDuplicate(int[] array){
        int[] result={};

        for (int each : array) {
            if (!ArrayUtility.contains(result,each)){
               result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }
    
    
    
    
    
    
}
