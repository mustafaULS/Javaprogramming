package day42_ExceptionsContinue;

public class MorningWarmUp {

    public static void main(String[] args) {


        System.out.println("push up started");


        for (int i = 1; i <= 30; i++) {

            System.out.println("\r push up " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("push up completed");


    }

    //custom exception :
    public static void sleep(int second){

        try {
            Thread.sleep((long)(second*1000)); // sleep require long so we casted to the long .
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }




}
