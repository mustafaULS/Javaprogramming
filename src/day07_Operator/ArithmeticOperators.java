package day07_Operator;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        int num3 = num1 / num2; //division
        System.out.println("num3 = " + num3);
        int num4 = num1 % num2;// remainder
        System.out.println("num4 = " + num4);
        //10 divided by 3 is equal to 3 with remainder of 1.
        System.out.println(num1 + "divided by " + num2 + " is equal to " + num3 + " with remainder of " + num4);

    }
}
