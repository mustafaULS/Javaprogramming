package day12_Scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" enter you name ");

        String name = scan.next();
        System.out.println("name = " + name);// only until space.
        scan.close();


    }
}
