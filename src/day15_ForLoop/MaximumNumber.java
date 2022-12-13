package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;  // any input will greater than this  once user input the number  it will replace it

        for (int i = 0; i < 5; i++) {  // how many times you want to repeat

            System.out.println("enter the number ");
            int num = scan.nextInt();

            if (num>max){   // if user input is greater than previously max then max will re-assigned as max.
                max=num;
            }
        }
        System.out.println(max);
scan.close();
    }
}
