package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class BranchingStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <='Z' ; i++) {

            System.out.println(i);
            if (i=='F'){
                break;
            }
        }

        System.out.println("------------------------------------");

        Scanner scan = new Scanner(System.in);

        while (true){               // enter number until negative number.
            System.out.println("enter the number.");
            int n = scan.nextInt();

            if (n<0){
                break;
            }
        }





    }
}
