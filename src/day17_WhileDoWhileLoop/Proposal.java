package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Proposal {

    public static void main(String[] args) {


        System.out.println(" WILL YOU MARRY ME ? YES OR NO ");

        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")))
        {
            System.out.println(" Invalid Answer. please re-enter");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("congrats");
        }else {
            System.out.println("beybey");
        }



    }
}
