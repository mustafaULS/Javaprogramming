package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" please enter your age");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println(" please enter your full name");
        String name = scan.nextLine();

        System.out.println(" enter your gpa");
        double gpa = scan.nextDouble();
        scan.nextLine();

        System.out.println("enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();
        

    }

}
/*
ask age 
ask full name
ask gpa
ask school name
 */
