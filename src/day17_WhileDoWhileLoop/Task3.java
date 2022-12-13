package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

/*
3. write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scan.nextInt();
        System.out.println("enter the second number");
        int num2 = scan.nextInt();
        System.out.println("enter the operator");
        char ch = scan.next().charAt(0);
        int result = 0;

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("Invalid operator, enter again");
            ch = scan.next().charAt(0);

            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else if (ch == '/') {
                result = num1 / num2;

            }

        }
        System.out.println(result);

    }
}
