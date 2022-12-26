package day41_Exception;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {

    public static void main(String[] args) {


        Employee employee=null;

        try{
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("this is first catch block");
            e.getStackTrace();
        }catch (ArithmeticException e){
            System.out.println(" this is second catch block");
            e.getStackTrace();
        }catch (NullPointerException e){
            System.out.println("this is third catch block");
            e.getStackTrace();
        }catch (RuntimeException e){
            System.out.println("this is run time exception");
            e.printStackTrace( );

        }finally { // this finally block is a option block in try catch.
            // after the last catch block.
            // always executed.
            System.out.println("this is finally block");
        }







    }
}
