package day15_ForLoop;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

/*
4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();


        if (num == 0) {
            System.out.println("Invalid number");
        } else {
            int fac = 1;
            for (int i = num; i >0; i--) {
                fac *= i;
            }
            System.out.println(fac);

        }


    }
}
