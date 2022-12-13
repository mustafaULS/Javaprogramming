package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");

        int n1= scan.nextInt();

        System.out.println("enter a math operator");
        char ch = scan.next().charAt(0);

        if (!(ch=='+'|| ch=='-')){
            System.err.println("Invalid math operator");
            System.exit(0); // any program after this will never print
        }

        System.out.println("enter a number");
        int n2=scan.nextInt();

        // if +  n1 + n2   or n1 - n2

    }
}
