package day04_variables;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int carpi = firstNumber * secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        //this is one way, the other way to do it is setup a new variable like addition.
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        //======================================================
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

        System.out.println(firstNumber+" * " + secondNumber+ " = "+ carpi);


    }


}
