package day09_IfStatement;

public class calculator {

    public static void main(String[] args) {

        double n1 = 5.8,
                n2 = 3.7;

        char mathOperator = '*';
        double result ;
        if (mathOperator == '+') {
            result = n1 + n2;
        } else if (mathOperator == '-') {
            result = n1 - n2;
        } else if (mathOperator == '*') {
            result = n1 * n2;
        } else {
            result = n1 / n2;
        }
        System.out.println(result);

    }
}
/*
2. Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
 */