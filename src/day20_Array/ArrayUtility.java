package day20_Array;

import java.util.Arrays;

public class ArrayUtility {

    public static void main(String[] args) {

        int [] number = {10,20,40,12,50,231,23};

        System.out.println(Arrays.toString(number));

        Arrays.sort(number);// from small to big

        System.out.println(Arrays.toString(number));

    }
}
