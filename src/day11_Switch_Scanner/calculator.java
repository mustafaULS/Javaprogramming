package day11_Switch_Scanner;

public class calculator {

    public static void main(String[] args) {


        double n1 = 200.5, n2 = 10.5;

        char operator = '+'; //  if is invalid operator   print = Invalid operator = % red line.

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';//pre condition

        if (valid) {// this is checked if the operator is valid .we have 4 possible outcome.

            switch (operator) {
                case '+': // in case you cant give date type as double. but in the block you can.
                    System.out.println(n1 + n2);// double date type.
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);

            }


        } else {
            System.err.println("Invalid operator = " + operator);// this is error print.
        }


    }
}
/*

ni  and n2 int will given to you .
use + - * /

 */
