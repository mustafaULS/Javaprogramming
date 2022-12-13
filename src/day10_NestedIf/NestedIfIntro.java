package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 955;

        if (score >= 0 && score <= 100) {


            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        } else {//if the score is not valid
            System.out.println("Invalid score ");
        }
        System.out.println("=========================================");
        int age = 20;
        boolean hasId = true;
        if (hasId) {// if the person has ID.
            if (age >= 21) {// if the person is 21 or older .
                System.out.println("eligible to buy alcohol");

            } else {// if the person is less then 21 .
                System.out.println("not eligible to buy alcohol");
            }

        } else {// if the person doesn't have ID
            System.out.println("you must have ID to buy alcohol");
        }


        System.out.println("======================");

        int number = -5;
        if (number >= 1 && number <= 7) {// if the number is between 1-7

            //7 possibilities  nned to use multi branch.
            if (number==1){
                System.out.println("monday");
            } else if (number==2) {
                System.out.println("tuesday");
            }else if (number==3) {
                System.out.println("wednesday");
            }else if (number==4) {
                System.out.println("thursday");
            }else if (number==5) {
                System.out.println("friday");
            }else if (number==6) {
                System.out.println("saturday");}
            else {
                System.out.println("sunday");
            }


        }else {//if the number is bigger then 7 or smaller then 1.
            System.out.println(" Invalid number");
        }


    }
}

