package day15_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // for the new line .

        for (int i = 100; i >= 50; --i) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("=============================================");


        for (int i = 1 ; i <=55;i++){ //         for mix with if

        if (i %2 ==0){
            System.out.print(i+" ");
        }

        }

        System.out.println();

        System.out.println("=============================================");
        for (int i =1;i <=54;i+=2){
            System.out.print(i+1+" ");
        }
        System.out.println();
        System.out.println("=============================================");








    }
}
