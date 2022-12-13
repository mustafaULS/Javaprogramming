package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        /*
        5. Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
         */

        System.out.println("hello , do you want to reserve a room");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();


        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer please enter yes or no");
            answer = scan.next();
        }
        scan.nextLine();
        if (answer.equals("yes")) {

            System.out.println("what kind of bed do you want to reserve ?");
            System.out.println(" we have King Bed ==> 120$ , Queen Bed ==> 100$ ,  single Bed ==> 80$");

            String answerBed = scan.nextLine().toLowerCase();
            while (!(answerBed.equals("king bed") || answerBed.equals("queen bed") || answerBed.equals("single bed"))) {
                System.err.println("Invalid answer, please answer king bed , queen bed or single bed.");
                answerBed = scan.nextLine().toLowerCase();
            }
            if (answerBed.equals("king bed")) {
                System.out.println("you reserved a king bed , its 120 dollar.");
            } else if (answerBed.equals("queen bed")) {
                System.out.println(" you reserved queen bed, its 100 dollar");

            } else {
                System.out.println(" you reserved single bed , its 80 dollar");
            }
        }
        if (answer.equals("no")) {
            System.out.println(" have a nice day");
        }
    }
}
