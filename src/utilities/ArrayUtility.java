package utilities;

import java.util.Arrays;

public class ArrayUtility {

    // print each integer of an integer array in separate line.
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // print each double of a double array in separate line.
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // print each string of a string array in separate line.
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // print each char of a char array in separate line.
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

//---------------------------------------------------------------------------


    //return the max number of integer array.
    public static int max(int[] number) {
        Arrays.sort(number);
        return number[number.length - 1];
    }

    //return the max number of double array.
    public static double max(double[] number) {
        Arrays.sort(number);
        return number[number.length - 1];
    }

    //return the min number of integer array.
    public static int min(int[] number) {
        Arrays.sort(number);
        return number[0];
    }

    //return the min number of double array.
    public static double min(double[] number) {
        Arrays.sort(number);
        return number[0];
    }


    //---------------------------------------------------------------------------


    //check if the given integer is contained in the given array , return boolean.
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if the given double is contained in the given array , return boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if the given char is contained in the given array , return boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //check if the given string is contained in the given array , return boolean.
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    //---------------------------------------------------------------------------


    //add given element to array return a new array
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

    //add given element to array return a new array
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

    //add given element to array return a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }

    //add given element to array return a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] += each;
        }
        result[result.length - 1] = element;
        return result;
    }


    //---------------------------------------------------------------------------


    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // return the frequency of given element from the given array.
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // return the frequency of given element from the given array.
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    // return the frequency of given element from the given array.
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

//---------------------------------------------------------------------------

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


    //---------------------------------------------------------------------------


    // removes the index of array return new array.
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length) {  // if given index is Invalid number.
            System.err.println("Invalid Index " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];

        int j = 0;          // represent result index number
        for (int i = 0; i < array.length; i++) {  // i : array's index number .
            if (i == index) {   // if the index of array is matching with the given index.
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
        for (int i = 0; i < array.length; i++) {  // i : array's index number .
            if (i == index) {   // if the index of array is matching with the given index.
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
        for (int i = 0; i < array.length; i++) {  // i : array's index number .
            if (i == index) {   // if the index of array is matching with the given index.
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
        for (int i = 0; i < array.length; i++) {  // i : array's index number .
            if (i == index) {   // if the index of array is matching with the given index.
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;

    }


    //---------------------------------------------------------------------------

    // merge 2 array. return a new array.
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] result = {};
        for (int each : array1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (int each : array2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    // merge 2 array. return a new array.
    public static double[] mergeArray(double[] array1, double[] array2) {
        double[] result = {};
        for (double each : array1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (double each : array2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    // merge 2 array. return a new array.
    public static String[] mergeArray(String[] array1, String[] array2) {
        String[] result = {};
        for (String each : array1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (String each : array2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    // merge 2 array. return a new array.
    public static char[] mergeArray(char[] array1, char[] array2) {
        char[] result = {};
        for (char each : array1) {
            result = ArrayUtility.addElement(result, each);
        }
        for (char each : array2) {
            result = ArrayUtility.addElement(result, each);
        }
        return result;
    }

    //---------------------------------------------------------------------------


    //reverse the given array, return the new array
    public static int[] reverseArray(int[] array) {

        int[] result = new int[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;


    }

    //reverse the given array, return the new array
    public static double[] reverseArray(double[] array) {

        double[] result = new double[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;


    }

    //reverse the given array, return the new array
    public static String[] reverseArray(String[] array) {

        String[] result = new String[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;


    }

    //reverse the given array, return the new array
    public static char[] reverseArray(char[] array) {

        char[] result = new char[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            result[j++] = array[i];

        }
        return result;


    }


    //---------------------------------------------------------------------------

    // replace the element of the array , of given index with new element.
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


    //---------------------------------------------------------------------------

    // replace  all the matching oldElement of the array to newElement.
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //---------------------------------------------------------------------------

    // remove the duplicate from the given array , return new array.
    public static int [] removeDuplicate(int[] array){
        int[] result={};

        for (int each : array) {
            if (!ArrayUtility.contains(result,each)){
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double [] removeDuplicate(double[] array){
        double[] result={};

        for (double each : array) {
            if (!ArrayUtility.contains(result,each)){
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char [] removeDuplicate(char[] array){
        char[] result={};

        for (char each : array) {
            if (!ArrayUtility.contains(result,each)){
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String [] removeDuplicate(String[] array){
        String[] result={};

        for (String each : array) {
            if (!ArrayUtility.contains(result,each)){
                result= ArrayUtility.addElement(result,each);
            }
        }
        return result;
    }

    //---------------------------------------------------------------------------

    // swap two element in one array.
    public static int[] swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i] = array[j];
        array[j]=temp;

        return array;
    }

    public static double[] swap(double[] array, int i, int j) {
        double temp=array[i];
        array[i] = array[j];
        array[j]=temp;

        return array;
    }

    public static char[] swap(char[] array, int i, int j) {
        char temp=array[i];
        array[i] = array[j];
        array[j]=temp;

        return array;
    }

    public static String[] swap(String[] array, int i, int j) {
        String temp=array[i];
        array[i] = array[j];
        array[j]=temp;

        return array;
    }

    //---------------------------------------------------------------------------
























}
