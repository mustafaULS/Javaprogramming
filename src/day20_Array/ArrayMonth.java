package day20_Array;

import java.util.Scanner;

public class ArrayMonth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" entry a number ");
        int number = scan.nextInt();

        if (number<1 || number>12 ){
            System.err.println(" Invalid number ");
            System.exit(0);
        }
        String [] month ={"jan","feb","mar","apl","may","jun","jul","agu","sep","oct","nov","dec",};

        System.out.println(month[number-1]);

        System.out.println("===============================================");

        // for print every each of element of month.
        for (int i = 0; i < month.length; i++) { // i : represent the index number of array starting from 0
            System.out.println( month[i]);
        }

        System.out.println("================================================");

        for (int i = month.length-1; i >=0 ; i--) {//  i : represent the index number of array starting from last index

            System.out.println(month[i]);
        }

    }
}
