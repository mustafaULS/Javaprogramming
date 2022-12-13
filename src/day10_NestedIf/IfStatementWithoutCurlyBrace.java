package day10_NestedIf;

public class IfStatementWithoutCurlyBrace {

    public static void main(String[] args) {

        int number = 5;
        String result = "";
        // if statement without curly brace  only use as there is only one statement in the block if. more than 2 cant use.

        if (number >= 1 && number <= 12) {

            if (number == 1)
                result = "january";
             else if (number == 2)
                result = "february";
             else if (number == 3)
                result = "march";
             else if (number == 4)
                result = "april";
             else if (number == 5)
                result = "may";

        } else
            result = " number is Invalid";


        System.out.println(result);

    }
}
