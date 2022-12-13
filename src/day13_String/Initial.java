package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name ");
        String firstName = scan.next();

        System.out.println("enter last name ");
        String lastName = scan.next();

        // charAt shows single character. depends on index number.

        char f = firstName.charAt(0);// index no     return char .
        char l = lastName.charAt(0);

        String initial = f+"."+l;
        System.out.println("initial = " + initial);
        scan.close();

    }
}
