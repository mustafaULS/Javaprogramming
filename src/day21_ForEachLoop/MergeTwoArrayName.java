package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrayName {
    public static void main(String[] args) {


        String[] name1 = {"mustafa", "ahmet", "mehmet"};
        String[] name2 = {"ulusoy", "sude", "koksal"};

        //first make sure the length.

        String[] nameTotal = new String[name1.length + name2.length];

        int i = 0;
        for (String each : name1) {
            nameTotal[i++] = each;    // i is post increment.start with 0 and equals to first element which is mustafa.
        }

        for (String each : name2) {
            nameTotal[i++] = each;
        }
        System.out.println(Arrays.toString(nameTotal));

        System.out.println("===========================================");

        char[] ch1 = {'a', 'b', 'c', 'd'};
        char[] ch2 = {'e', 'f'};
        char[] ch3 = new char[ch1.length + ch2.length];

        int j = 0;
        for (char each : ch1) {
            ch3[j++] = each;
        }
        for (char each : ch2) {
            ch3[j++] = each;
        }
        System.out.println(Arrays.toString(ch3));

    }
}