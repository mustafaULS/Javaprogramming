package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 101; i++) {// from 1 to 100  addition .
            sum += i;
        }

        System.out.println(sum);



        System.out.println("================================================");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { // repeat 5 times.

            System.out.println(" enter the number");

            total += scan.nextInt();

        }
        System.out.println("total = " + total);
        scan.close();

    }
}
