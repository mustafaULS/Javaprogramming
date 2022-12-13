package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 7, 2, 3, 4, 5, 6, 6, 6, 6, 6};
        array = replaceAll(array, 6, 8);
        System.out.println(Arrays.toString(array));

    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }


}
