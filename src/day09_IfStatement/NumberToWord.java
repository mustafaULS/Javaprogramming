package day09_IfStatement;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 5;
        String result = "" ;
        if (number ==0){
            result = "zero";
        } else if (number==1) {
            result="one";
        } else if (number ==2) {
            result= "two";
        } else if (number==3) {
            result="three";
        } else if (number ==4) {
            result="fore";

        } else if (number ==5) {
            result="five";
        }else if (number ==6) {
            result="six";
        }
        System.out.println(result);
    }
}
/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 6 to words
Ex:
number = 1;
output:
One
 */