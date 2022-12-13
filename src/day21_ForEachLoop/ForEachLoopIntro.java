package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] number = {10, 20, 30, 40, 50, 60};
        // for loop
        for (int i = 0; i < number.length; i++) {
            int element = number[i];
            System.out.println(element);
        }
        System.out.println("==================================");
        //for each loop
        for (int each : number) {
            System.out.println(each);
        }


    }
}
