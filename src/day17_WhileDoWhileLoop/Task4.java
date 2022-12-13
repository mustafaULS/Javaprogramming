package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("enter the number");

        int number = new Scanner(System.in).nextInt();

        String divisible3 = "",
                divisible5 = "",
                divisible15 = "";

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
                System.out.print(i + " ");
            }
            // not finish;

        }
    }
}

