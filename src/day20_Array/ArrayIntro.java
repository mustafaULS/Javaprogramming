package day20_Array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {


       // String name [] = new String[5];
       // String [] name1 = new String[5];

        // this array you only know how many of date, but you dont know what they are .you assign the date later.
        String [] myGroup   = new String[5];  //0 - 4 .    only can contain 5 date.
        myGroup [ 0]="mustafa";
        myGroup [ 1]= "uls";
        myGroup [ 2] = "ahmet";
        myGroup [ 3] = "mehmet";
        myGroup [ 4] = "emin";

        System.out.println(Arrays.toString(myGroup));
        System.out.println("=======================================");

        // this array you know how many of them and also know what they are.  one variable assign multi date.

        String [] days ={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        //               0             1          2        3           4        5          6

        int number = 5; // example for user provide input.

        if (number<1 || number>7){
            System.err.println(" Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);// because start with 0,




    }
}
