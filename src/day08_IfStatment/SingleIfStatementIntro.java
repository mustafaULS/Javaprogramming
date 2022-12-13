package day08_IfStatment;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
/*
we will give you a number , and we wanna know the number is odd number or even number
odd number 奇数  even number 偶数。  use "example 100%2 = 0 its even number.

 */
        int number = 10;
        boolean evenNumber = number % 2 == 0;
        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        /*boolean oddNumber = number %2 !=0;
        if (oddNumber){
            System.out.println(number +" is odd number ");
        }
        */

        if (!evenNumber) {
            System.out.println(number + " is odd number ");
        }

        System.out.println("-----------------------------------------");

        int n = 200;
        if (n > 0) {
            System.out.println(n + " is positive number ");
        }
        if (n < 0) {
            System.out.println(n + " is negative number");
        }
        if (n == 0) {
            System.out.println(n + " is zero");
        }

    }
}
