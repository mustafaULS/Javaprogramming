package day14_String2;

import java.util.Scanner;

public class AboutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");

        String word = scan.next();  //    xabcd
//                                        01234

        if (word.charAt(0)=='x'){ //equal  string icin   equal sadece string .

           //System.out.println(word.substring(1));  // abcd

            System.out.println(word.replaceFirst("x",""));

        }else {
            System.out.println("never mind");
        }
        scan.close();
    }
}
