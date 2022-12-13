package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {


    public static void main(String[] args) {

        int [] array = {1,3,4,5,7,9,3,6,8,0};
        array=replaceElement(array,5,60);
        System.out.println(Arrays.toString(array));

        String [] arr = {"mustafa","ahmet","sude","wow"};
        arr=replaceElement(arr,2,"hello");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] replaceElement(int[] array, int index, int newElement) {

        if (index<0||index> array.length-1){
            System.out.println("Invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static double[] replaceElement(double[] array, int index, double newElement) {

        if (index<0||index> array.length-1){
            System.out.println("Invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[] replaceElement(char[] array, int index, char newElement) {

        if (index<0||index> array.length-1){
            System.out.println("Invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static String[] replaceElement(String[] array, int index, String newElement) {

        if (index<0||index> array.length-1){
            System.out.println("Invalid number");
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }



}
