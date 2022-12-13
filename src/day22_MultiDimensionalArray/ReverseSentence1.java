package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence1 {

    public static void main(String[] args) {


        String sentence = "today is good day to learn java";

        String [] words  =sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse +=words[i]+" ";

        }
        System.out.println(reverse+ " ");






    }
}
