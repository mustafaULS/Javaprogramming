package day15_ForLoop;

public class FINRA {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) { // i % 15 ==0
                System.out.print("finra ");
            } else if (i % 5 == 0) {
                System.out.print("ra ");

            } else if (i % 3 == 0) {
                System.out.print("fin ");
            } else {
                System.out.print(i + " ");
            }

        }





    }


}

