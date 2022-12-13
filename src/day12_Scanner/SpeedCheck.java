package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speedLimit = 55;
        System.out.println("please enter your current speed . ");

        int currentSpeed = scan.nextInt();
        int overSpeed = currentSpeed - speedLimit;

        if (overSpeed >0) {
            System.out.println("You're driving "+ overSpeed+" over the limit. Slow down!");
        }


        scan.close();

    }
}
