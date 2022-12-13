package day12_Scanner;


import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enteer the miles");
        double miles = scan.nextDouble();

        double km = miles*1.609;
        System.out.println(miles + " miles equal to " + km+" kilometers .");

        scan.close();

    }

}
