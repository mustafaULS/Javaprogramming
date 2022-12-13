package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        // username : cydeo.
        // password : cydeo123.

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the username");
        String username = scan.next();

        System.out.println("enter the password");
        String password = scan.next();

        if (username.equals("cydeo") && password.equals("cydeo123")) {// if credentials are valid.

            System.out.println("logged in");

        } else { // Invalid.

            int attempts = 3;

            while (!(username.equals("cydeo") && password.equals("cydeo123")) && attempts > 0) {
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("enter the username");
                username = scan.next();
                System.out.println("enter the password");
                password = scan.next();
                attempts--;

            }

            if (username.equals("cydeo") && password.equals("cydeo123")){
                System.out.println("logged in");
            }else {
                System.out.println(" you account is lock");
            }









        }


    }
}
