package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your username");
        String user = scan.next();
        System.out.println(" enter your password");
        String password = scan.next();

        // there is 2 possible . correct or false ;

        if (user.equals("cydeo")&& password.equals("cydeo123")){
            System.out.println("log in ");
        }else {

            for (int i = 1; i < 3; i++) {
                System.out.println("wrong username or password. please enter again");
                System.out.println(" enter your username");
                 user = scan.next();
                System.out.println(" enter your password");
                 password = scan.next();

                 if (user.equals("cydeo")&& password.equals("cydeo123")){
                     System.out.println(" log in ");
                     break;
                 }

                 if (!(user.equals("cydeo")&& password.equals("cydeo123"))){
                     System.out.println("your account is locked");
                 }



            }

        }


    }
}
