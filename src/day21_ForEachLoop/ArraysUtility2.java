package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        // copy of
        String[] student = {"elif", "sinem", "mustafa", " sude ", "emin", "ulusoy", " cydeo"};
        String[] birds = Arrays.copyOf(student, 3); // from 0 to copy
        System.out.println(Arrays.toString(birds));

        // you can also re assign a array variable.
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        number = Arrays.copyOf(number, 5);
        System.out.println(Arrays.toString(number));

        System.out.println("==================================");
        //copy of range.
        char[] cha1 = {'a', 'b', 'c', 'd', 'e', 'q', 'w', 'r', 't'};
        System.out.println(Arrays.toString(cha1));
        char[] cha2 = Arrays.copyOfRange(cha1, 2, 5); // ending index is executed. you can add 1 to including .
        System.out.println(Arrays.toString(cha2));

        System.out.println("==================================");
        int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90,100};
        //index        0    1   2   3   4   5   6   7   8   9
        int[] result = Arrays.copyOfRange(score,3,7); // if you wanna including 80 add 1  7+1
        System.out.println(Arrays.toString(result));
        int[] result1 = Arrays.copyOfRange(score,3,score.length); // to the last index.
        System.out.println(Arrays.toString(result1));


    }
}
