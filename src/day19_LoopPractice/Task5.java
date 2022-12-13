package day19_LoopPractice;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("How much you make an hour");
            double hourlyRate = scan.nextDouble();

            if (hourlyRate <= 0) {
                System.err.println("Invalid enter");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHour = scan.nextInt();

            if (weeklyHour < 0 || weeklyHour > 144) {
                System.out.println(" Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println(" Enter your state tax rate");
            double tax = scan.nextDouble();
            if (tax < 0 || tax > 10) {
                System.out.println(" Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double grossSalary = hourlyRate * weeklyHour * 52;
            double federalTax = grossSalary * 0.26;
            double stateTax = tax * 0.01 * grossSalary;
            double totalTax = federalTax + stateTax;
            double net = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("net = " + net);

            System.out.println(" Would you like to continue?  yes  or no");
            String answer = scan.next().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println(" Invalid answer ");
                System.exit(0);
            }

            if (answer.equals("no")) {
                System.out.println(" Thank you for using  Cydeo Salary Calculator APP");
                break;
            }

        }

        scan.close();
    }
}
