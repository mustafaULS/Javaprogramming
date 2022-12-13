package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementToArray_OverLoading {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6};//7
        number=addElement(number,7);
        System.out.println(Arrays.toString(number));

        char[] chars = {'a', 'b', 'c', 'd'};
        chars=addElement(chars,'e');
        System.out.println(Arrays.toString(chars));

        String[] names = {"ahmet", "mehmet", "alex", "james"};
        names=addElement(names,"mustafa");
        System.out.println(Arrays.toString(names));




    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element; // last index number od array result.
        //result [i]=element;  when i stop, i will ben last index of array,  so add new element to last index number.
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element; // last index number od array result.
        //result [i]=element;  when i stop, i will ben last index of array,  so add new element to last index number.
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }

}
