package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letter = new char[26];
        //letter[0]='a';
        //letter[0]='b';
        // create a loop for getting each character. need to 2 different variable, one for index second for characters.

        for (char i = 'A', j = 0; i <= 'Z' && j < letter.length; i++, j++) {
            // i is character  j is index number.
            letter[j]=i;
        }
        System.out.println(Arrays.toString(letter));
        System.out.println("===========================================");
        // other easy solution.

        char ch = 'A';  // first variable ch assign
        for (int i = 0; i < letter.length; i++) { // for loop increase index number .
            letter[i]=ch;
            ch++; //char increase.
        }
        System.out.println(Arrays.toString(letter));

        System.out.println("===========================================");




    }
}
