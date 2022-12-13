package day12_Scanner;

import java.util.Scanner;

public class CentsToDollar {

    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        scan.close();

        int dollar = number / 100;
        int cents = number % 100;
        System.out.println(dollar + " $ dollar and " + cents + " cents .");


    }
}
