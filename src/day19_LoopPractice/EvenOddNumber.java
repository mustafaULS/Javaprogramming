package day19_LoopPractice;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number");

            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(" even number");
            } else {
                System.out.println(" odd number");
            }

            System.out.println(" would you like to enter again   yes / no");

            String answer = scan.next();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println(" thank you");
                break;
            }
        }


    }
}
