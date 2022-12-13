package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the 5 number");
        int positive = 0 ;
        int negative = 0;

        for (int i =0 ; i <5;i++){
            int num = scan.nextInt();
            if (num>0){
                positive++;
            }else {
                negative ++;
            }

            System.out.println(positive);
            System.out.println(negative);


        }


scan.close();


    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */
