package day41_Exception;

public class FinallyBlock {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};


        try{
            System.out.println(array[10]);
            System.out.println("this is try block");

        }catch (RuntimeException e){

            e.printStackTrace();
            System.out.println("ths is catch block");

            //System.exit(0); terminate the finally block

        }finally {
            System.out.println("finally block");
        }
        //only way to exit finally block is system.exit.











    }
}
