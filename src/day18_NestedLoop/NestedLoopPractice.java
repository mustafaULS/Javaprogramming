package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter you age");
        int age = scan.nextInt();

        while (!(age > 0 && age <= 120)){
            System.out.println("Invalid age, enter again");
            age = scan.nextInt();


        }




    }
}
