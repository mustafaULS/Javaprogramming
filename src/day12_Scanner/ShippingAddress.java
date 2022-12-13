package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter your full name");
        String name = input.nextLine();

        System.out.println("enter your building name");
        String buildingName = input.next();
        input.nextLine();

        System.out.println("enter your street name");
        String streetName = input.nextLine();

        System.out.println("enter your city name");
        String cityName = input.nextLine();

        System.out.println("enter your state");
        String stateName = input.next();
        input.nextLine();

        System.out.println("enter your zip code");
        String code= input.next();

        System.out.println("name = " + name);
        System.out.println("buildingName = " + buildingName);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("code = " + code);
        input.close();

    }
}
/*
full name     ----nextline
building name  ---- next
stress name ----- nextline
city name ------ nextline
state------- next
zip code------  next
display the shipping address.
 */
