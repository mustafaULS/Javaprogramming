package day10_NestedIf;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int number1 = 5;
        String result = "";//temporary string. if you have to contain all the possibilities, then you can delete the =.

        if (number1 >= 1 && number1 <= 12) { // if the number1 is valid

            if (number1 == 1) {
                result = "january";
            } else if (number1 == 2) {
                result = "february";
            } else if (number1 == 3) {
                result = "march";
            } else if (number1 == 4) {
                result = "april";
            } else if (number1 == 5) {
                result = "may";
            }
            //there is also miss the else statement ... i only write to may  the rest of month  you got the Idea.

        } else {// if the number1 is Invalid.
            result = " number1 is Invalid";
        }

        System.out.println(result);
    }
}
