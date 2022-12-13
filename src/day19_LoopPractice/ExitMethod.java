package day19_LoopPractice;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 3){

                System.exit(0);

            }
            System.out.println(i);// terminate the program
        }

        System.out.println(" wowowo");
    }
}
