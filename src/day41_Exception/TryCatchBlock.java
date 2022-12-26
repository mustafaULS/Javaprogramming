package day41_Exception;

import java.sql.SQLOutput;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("test started");


        //System.out.println(9/0);
        // this is an unchecked exception.this will destroy the code.
        // we handle this with try - catch block.

        try {
            // all the exception inside of try block
            System.out.println(100/0);

        }catch (ArithmeticException e){ // first exception type .  e is variable. can be anything.

            System.out.println("Arithmetic Exception is fund");

        }



        System.out.println("test finished");


        System.out.println("-----------------------------------------");



        System.out.println("test 2 started");

        int[] number ={1,2,3,4,5};

        try{
            System.out.println(number[200]);
            System.out.println(" this is try block");

        }catch (RuntimeException e){
            // because you dont know which exception class to use.
            // just use run time exception super class of all the un-check exception class


            // instand of this :  System.out.println("run time exception is fund");

            e.printStackTrace();// getting more details .
            //System.out.println(e.getMessage());

        }

        System.out.println("test2 is finish");


        System.out.println("-----------------------------------------");


        System.out.println("test 3 is start");



        try {
            System.out.println("cydeo".substring(2,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("test 3 is finish");


        System.out.println("-----------------------------------------");

        // check exception:

        System.out.println("test 4 start");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test 4 finish");












    }




}
