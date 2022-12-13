package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        // string to the char array
        // to char array.

        String str1 = "acdb";
        String str2 = "dbca";

        char [] ch1 = str1.toCharArray();  // first make string to the char array.
        char [] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);                   // then ascending the char array
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram =Arrays.equals(ch1,ch2);     // finally compare two char array.
        System.out.println("anagram = " + anagram);


    }
}
