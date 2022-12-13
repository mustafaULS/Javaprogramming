package day15_ForLoop;

import java.util.Scanner;

public class TaskString {


    public static void main(String[] args) {  // replace x to a

        System.out.println(" enter the word");

        String word = new Scanner(System.in).next();    // if you use nly one time scanner you can use like this.


        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x","a");
        }
        System.out.println("word = " + word);


    }
}
