package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("how many number do you want to entry");
        int length = scan.nextInt(); // user enter is our length .
        if (length<=0){              // cant give negative number
            System.err.println("Invalid number");
            System.exit(0);
        }

        int [ ] number = new int[length];

        for (int i = 0; i < length; i++) {   // i = index number .  for every enter number = index number  and i is increasing
            System.out.println("enter the number");
            number[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(number));





    }
}
