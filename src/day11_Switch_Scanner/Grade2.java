package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        /*
        if the grade is a b c d   ==== pass
         otherwise  failed.
         */

        char ch = 'A';                 //  this is switch type of   OR logic statement.   back to back
                                       //  we dont have and logic statement in switch.
                                       //  you can also create a string result
        String result = "";
        switch (ch) {            // you can also write in one line.
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "pass";
                break;
            default:
                result = "failed";
        }
        System.out.println(result);

    }
}
