package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 100;
        /*
        if (s >= 0 && s <= 100) {
            if (s >= 60) {
                System.out.println("pass");
            } else {
                System.out.println("failed");
            }

        } else {
            System.out.println("Invalid score");
        }

         */
       String rusult= (s >= 0 && s <= 100)?(s >= 60)?"pass":"failed":"Invalid number";
        System.out.println(rusult);
        //nested if can write in ternaries  just followed the order.
        //()? if statement then  Inside ()? "" :()?"   after all the possibilities  close with nested if with else which:



    }


}
