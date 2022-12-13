package day17_WhileDoWhileLoop;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        while (a) {// because its false   while loop not print
            System.out.println("wooden spoon----while");
        }

        System.out.println("--------------------------------------");

        do {
            System.out.println("wooden spoon----do while");     // even its not true do while also will print one time
        } while (a);                                            // then check if its true or false. if its true will repeat.if false break.

         // do while loop execute at least one time.

    }
}
