package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");

        double[] arr2 = {1.1, 2.1, 3.1, 4.1};
        arr2 = addDouble(arr2, 5.1);
        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------------------");

        String[] names = {"mustafa", "ulusoy", "sude", "koksal"};
        names = addString(names, "wow");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------");

        char[] chars = {'a', 'b', 'c', 'd'};
        chars = addChar(chars, 'e');
        System.out.println(Arrays.toString(chars));
        System.out.println("--------------------------");


    }
// solution 1 :  command + r  = replace int to double , replace one word to another.

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element; // last index number od array result.
        //result [i]=element;  when i stop, i will ben last index of array,  so add new element to last index number.
        return result;
    }

    public static double[] addDouble(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] += each;
        }
        result[i] = element;
        return result;


    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }

}
/*
1 task:  {1,2,3,4}  add 5.
add integer to array
2 task:
add double to array
3 task:
add string to array
4 task:
add char to array
 */
