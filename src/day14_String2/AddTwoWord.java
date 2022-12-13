package day14_String2;

import java.util.Scanner;

public class AddTwoWord {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first word"); // first word son harf  ==  ikinci harfin bas harfina ==
        String firstWord = scan.next();
        System.out.println("enter your second word");
        String secondWord = scan.next();
        scan.close();

        if (firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            System.out.println(firstWord+secondWord.substring(1));

        }else {
            System.out.println(firstWord+secondWord);

        }

/*
        4. Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the
        last letter is the same,
                print that character once.
                Input:
        one + eight

        Output:
        oneight

 */
    }
}
