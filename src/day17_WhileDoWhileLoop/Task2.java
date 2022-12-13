package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Task2 {
    /*
    2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;


        while (true) {
            System.out.println("enter the number");
            int number = scan.nextInt();
            if (number >= 0) {
                sum += number;
            }else {
                break;
            }

        }
        System.out.println(sum);
        scan.close();
    }
}
