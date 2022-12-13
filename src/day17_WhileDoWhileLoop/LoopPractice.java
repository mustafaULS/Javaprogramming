package day17_WhileDoWhileLoop;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {  // repeat 10 time
            System.out.print(i);
        }
        System.out.println();
        System.out.println("--------------------------------------");


        int a = 1;              // give initialization outside of while loop.
        while (a <= 10) {       // condition
            System.out.print(a);
            a++;                // iteration in the end
        }
        System.out.println();
        System.out.println("--------------------------------------");


        int b=1;                // initialization
        do {
            System.out.print(b);
            b++;                // iteration
        } while (b<=10);         // condition


    }
}
