package day20_Array;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int [] number = {10,20,50,70}; // size 4

        System.out.println(Arrays.toString(number)); // for print all the array

        System.out.println("===============================================");

        int [] score = new int[5];
        score [1] = 85;
        score[score.length-1]=90; // total index number -1 .
        score[0]=10;
        score[2]=20;
        score[3]=50;
        System.out.println(Arrays.toString(score));



    }
}
