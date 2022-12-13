package day17_WhileDoWhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age");

        int age = scan.nextInt();// valid age 1-120;

        while (!(age >= 1 && age <= 120)) {

            System.err.println("re-enter your age");

            age = scan.nextInt();// valid age 1-120;
        }

        System.out.println("are you us citizen ? yes or no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("re-enter yes or no");
            answer = scan.next().toLowerCase();
        }

        String rusult = (age >= 18 && answer.equals("yes")) ? "you are eligible to vote" : "you are not eligible to vote";

        System.out.println(rusult);
    }
}
