package day14_String2;

import java.util.Scanner;

public class Task2lastwordLY {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter a word ");

        String word = scan.next();
        scan.close();

        String lastWord =word.substring(word.length()-2);
        //                      actual    ly

        if (lastWord.equals("ly")){
            System.out.println("really ?");

        }else {
            System.out.println("never mind");
        }



    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"


 */
