package day18_NestedLoop;

public class DivideTwoNumber {

    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        int count = 0;   // how many times t repeat;

        while (a >= b) {
            a -= b;  //     continuously decrease b.
            count++;

        }
        System.out.println(20 +" divided by "+b+" is "+count+" with remainder of "+a);








        /*
        write a program that can divide two number .
         */

    }
}
