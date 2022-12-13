package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a number");

            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println(num1 + " is even number");
            } else {
                System.out.println(num1 + " is odd number");
            }

            System.out.println("would you like to enter another number");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("would you like to enter another number");
                 a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }




        }


    }
}
