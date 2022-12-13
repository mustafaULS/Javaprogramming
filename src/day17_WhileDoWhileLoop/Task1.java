package day17_WhileDoWhileLoop;

public class Task1 {

    public static void main(String[] args) {

/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */

        int a = 50;
        int b = 10;

        int count = 0;


        while (a >= b) {
            a -= b;
            count++;

        }
        System.out.println(count);

    }
}
