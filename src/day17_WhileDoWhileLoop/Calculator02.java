package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Calculator02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number :");
        int num1 = scan.nextInt();
        System.out.println("enter the second number :");
        int num2 = scan.nextInt();
        System.out.println(" enter the operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-')) {
            System.out.println("Invalid operator, pleasr re-enter the operator");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch == '+') ? num1 + num2 : num1 - num2);


    }

}

