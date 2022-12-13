package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseNames {

    public static void main(String[] args) {

        String [] name = { "mustafa ulusoy","sude koksal","ali bogra","sadam zeytin","kurt adam"};

        for (String each : name) { //each name .

            String reverse = "";

            for (int i = each.length()-1; i >=0 ; i--) {

                reverse+=each.charAt(i);

            }
            System.out.println(reverse);



        }



    }
}
