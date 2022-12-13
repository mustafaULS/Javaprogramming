package day19_LoopPractice;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter the score");
            int score = scan.nextInt();
            if (!(score >= 0 && score <= 100)) {
                System.out.println("Invalid score .");
                System.exit(0);
            }
            String result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            System.out.println(result);

            System.out.println("would you like to continue");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid enter ");
                System.exit(0);
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
scan.close();
    }
}
